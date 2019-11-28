package com.example.TP_CRental;

import com.example.TP_CRental.Car;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CarRentalService {

    private List<Car> cars = new ArrayList<Car>();

    public CarRentalService() {
        cars.add(new Car("11AA22", "Ferrari", 1000, true));
        cars.add(new Car("33BB44", "Porshe", 2222, false));
    }

    @RequestMapping(value="/cars", method=RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Car> getListOfCars(){
        //display on localhost the different cars and their data
        return cars;
    }

    @RequestMapping(value = "/cars", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public void addCar(@RequestBody Car car) throws Exception{
        System.out.println(car);
        cars.add(car);
    }

    @RequestMapping(value = "/cars/{plateNumber}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Car getCar(@PathVariable(value = "plateNumber") String plateNumber){
        for(Car car: cars){
            if(car.getPlateNumber().equals(plateNumber)){
                return car;
            }
        }
        return null;
    }

}
