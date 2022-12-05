package de.neuefische.demo.CarRepo;

import de.neuefische.demo.Carmodel.Car;

import java.util.ArrayList;
import java.util.List;

public class CarRepo {
    public final static List<Car> cars = new ArrayList<>();

    //Neues Car in die Liste Hinzufügen
    public void add(Car newCar) {
        cars.add(newCar);
    }
    //Die ganze Car Liste ausgeben
    public List<Car> getCars(){
        return cars;
    }
}
