package com.rouvsen.practice.enums;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/cars")
public class CarController {

    @GetMapping("/colors")
    public void getCarColor(@RequestBody Car car) {
        System.out.println("result: " + car);
    }

}
