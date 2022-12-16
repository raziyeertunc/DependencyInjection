package com.example.demo;

public class CarService {


    private CarDao carDao;
    private EmailService emailService;
    private MOTService motService;


    public CarService(CarDao carDao, EmailService emailService,MOTService motService) {
        this.carDao = carDao;
        this.emailService = emailService;
        this.motService= motService;

    }
}
