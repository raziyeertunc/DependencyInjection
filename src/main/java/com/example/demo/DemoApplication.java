package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        //dependencies
        CarDao carDao = new CarDao();
        EmailService emailService = new EmailService();
        MOTService  motService = new MOTService(emailService);

        //inject
        CarService carService = new CarService(
                                                carDao,
                                                emailService,
                                                motService
        );
    }

}
/* Solution is use something known as the singleton pattern
    Singleton pattern basically instantiates your class just once
 */


/*instead of having to say new car , new email , new carService ;
we get rid of all of this.(yani main'de new new demek yerine @Bean annotation'ı koyuyoruz. @Bean annotation'ı instantiating this class for us.
@Component ve @Bean all kind of the same thing.
 */

//@Inject ve @Autowired same thing

//@Component or @Bean koyarsam orası singleton demek