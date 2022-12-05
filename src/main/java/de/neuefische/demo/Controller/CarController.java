package de.neuefische.demo.Controller;


import de.neuefische.demo.CarRepo.CarRepo;
import de.neuefische.demo.Carmodel.Car;
import de.neuefische.demo.Service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {
    public final static CarService carService = new CarService();

    @PostMapping()
    public void addCar(@RequestBody Car newCar){
        carService.add(newCar);
    }
    @GetMapping()
    public List<Car> carList(){
        return carService.getCars();
    }

}
