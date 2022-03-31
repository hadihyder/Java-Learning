package com.mthree.CarLot.dao;

import com.mthree.CarLot.dto.Car;

import java.util.List;

public interface CarLotDao {

    public Car addCar(String VIN, Car car);

    public Car getCar(String VIN);

    public List<Car> getCars();

    public void editCar(String VIN, Car car);

    public Car removeCar(String VIN);
}
