package com.telran.project;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.name = "Toyota";
        car1.producingCountry = "Japan";
        car1.yearOfIssue = 2015;
        car1.maxSpeed = 220;

        Car car2 = new Car();
        car2.name = "BMW";
        car2.producingCountry = "Germany";
        car2.yearOfIssue = 2016;
        car2.maxSpeed = 280;

        Car car3 = new Car();
        car3.name = "Alfa Romeo";
        car3.producingCountry = "Italy";
        car3.yearOfIssue = 2017;
        car3.maxSpeed = 260;

        Car car4 = new Car();
        car4.name = "LADA";
        car4.producingCountry = "Russia";
        car4.yearOfIssue = 2019;
        car4.maxSpeed = 200;

        Car car5 = new Car();
        car5.name = "Rolls Roys";
        car5.producingCountry = "England";
        car5.yearOfIssue = 2022;
        car5.maxSpeed = 320;

        Car[] allInformationAboutCar = {car1, car2, car3, car4, car5};

        for (Car allCar : allInformationAboutCar) {
            System.out.println("Car name is : " + allCar.name + " | Car producing country is : " + allCar.producingCountry + " | Car year of issue is : "
                    + allCar.yearOfIssue + " | Car maximal speed is : " + allCar.maxSpeed + " km/h");
        }

    }


}
