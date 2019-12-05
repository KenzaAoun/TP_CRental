package com.example.TP_CarRental;
/** Display a rented car with the beginning & ending dates of renting **/

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarRentalRent {
        //Initializing a list which hold the information concerning the rented dates of a car
        private List<Rent> rentedCar = new ArrayList<>();

    /*Display the renting dates of a specific car, following its plate Number*/
        public CarRentalRent()  {
            try {
                //Setting the date format
                SimpleDateFormat date = new SimpleDateFormat("dd/mm/yyyy");
                //Setting dates for testing
                Date beginDate = date.parse("25/10/2019");
                Date endDate = date.parse ("15/11/2019");

                rentedCar.add (new Rent("11AA22", endDate, beginDate, true));

            } catch (ParseException e) {
                e.printStackTrace();
            }

        }

        /*Display on local host the parameters of a rented car*/
        /**Doesn't work**/
        @RequestMapping(value="/rentedCar", method= RequestMethod.GET)
        @ResponseStatus(HttpStatus.OK)
        public Rent getrentedCar(){
            System.out.println("RENTED CARS" + rentedCar.get(0));
            Rent leased = rentedCar.get(0);
            return leased;
        }

}
