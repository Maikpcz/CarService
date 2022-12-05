package de.neuefische.demo.Service;

import de.neuefische.demo.CarRepo.CarRepo;
import de.neuefische.demo.Carmodel.Car;

import java.util.List;

public class CarService {
    public final static CarRepo carRepo = new CarRepo();

    public void add(Car newCar) {
        carRepo.add(newCar);
    }
    public List<Car> getCars(){
        return carRepo.getCars();
    }
}