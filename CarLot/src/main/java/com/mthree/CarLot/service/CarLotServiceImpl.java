package com.mthree.CarLot.service;

import com.mthree.CarLot.dao.CarLotDao;
import com.mthree.CarLot.dto.Car;
import com.mthree.CarLot.dto.CarKey;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CarLotServiceImpl implements CarLotService{

    private CarLotDao dao;

    public CarLotServiceImpl(CarLotDao dao){
        this.dao = dao;
    }

    @Override
    public Car getACar(String VIN) {
        Car car = dao.getCar(VIN);
        return car;
    }

    @Override
    public List<Car> getAllCars() {
        return dao.getCars();
    }

    @Override
    public List<Car> getCarsByColor(String color) {
        List<Car> cars = this.getAllCars();
        List<Car> carsByColor = new ArrayList<>();
        for(Car currCar: cars) {
            if(currCar.getColor().equals(color)){
                carsByColor.add(currCar);
            }
        }
        return carsByColor;
    }

    @Override
    public List<Car> getCarsInBudget(BigDecimal maxPrice) {
        List<Car> cars = this.getAllCars();
        List<Car> carsInBudget = new ArrayList<>();

        for(Car currCar: cars){
            if(currCar.getPrice().compareTo(maxPrice) <= 0){
                carsInBudget.add(currCar);
            }
        }
        return carsInBudget;
    }

    @Override
    public List<Car> getCarByMakeAndModel(String make, String model) {
        List<Car> cars = this.getAllCars();
        List<Car> carsByMakeAndModel = new ArrayList<>();

        for( Car currCar: cars) {
            if(currCar.getMake().equals(make) && currCar.getModel().equals(model)) {
                carsByMakeAndModel.add(currCar);
            }
        }
        return carsByMakeAndModel;
    }

    @Override
    public BigDecimal discountCar(String VIN, BigDecimal percentDiscount) throws NoSuchCarException {
        if(dao.getCar(VIN) == null) {
            throw new NoSuchCarException(
                    "Error: No Such Car Found in the lot" + VIN
            );
        }
            Car currCar = dao.getCar(VIN);
            final BigDecimal ONE_HUNDRED = new BigDecimal(100);
            BigDecimal newPrice = currCar.getPrice().multiply(ONE_HUNDRED).divide(percentDiscount);
            currCar.setPrice(newPrice);
            dao.editCar(VIN, currCar);
            return newPrice;
    }

    @Override
    public CarKey sellCar(String VIN, BigDecimal cashPaid) throws NoSuchCarException, OverpaidPriceException, UnderpaidPriceException {
        Car currCar = dao.getCar(VIN);
        if(currCar == null) {
            throw new NoSuchCarException(
                    "Error: No Such Car Found in the lot" + VIN
            );
        }
        if(currCar.getPrice().compareTo(cashPaid) < 0) {
            throw new UnderpaidPriceException(
                    "Paid less than actual price"
            );
        }
        if(currCar.getPrice().compareTo(cashPaid) > 0) {
            throw new OverpaidPriceException(
                    "Paid more than actual price"
            );
        }
        CarKey key = new CarKey(VIN);
        key.setLaserCut(true);
        return key;
    }
}










