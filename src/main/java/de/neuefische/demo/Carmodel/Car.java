package de.neuefische.demo.Carmodel;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {
    private String brand;
    private int wheels;
    private boolean TÜV;
}
