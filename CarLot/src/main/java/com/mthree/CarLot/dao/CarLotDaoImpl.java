package com.mthree.CarLot.dao;

import com.mthree.CarLot.dto.Car;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarLotDaoImpl implements CarLotDao{

    private final Map<String, Car> carMap = new HashMap<>();

    @Override
    public Car addCar(String VIN, Car car) {
        return carMap.put(VIN, car);
    }

    @Override
    public Car getCar(String VIN) {
        return carMap.get(VIN);
    }

    @Override
    public List<Car> getCars() {

        return new ArrayList<Car>(carMap.values());
    }

    @Override
    public void editCar(String VIN, Car car) {
        carMap.put(VIN, car);

    }

    @Override
    public Car removeCar(String VIN) {
        return carMap.remove(VIN);
    }
}
