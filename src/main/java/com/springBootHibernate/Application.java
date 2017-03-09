package com.springBootHibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by fionalyn.ping.fu on 2/22/2017.
 */
@SpringBootApplication
//@ServletComponentScan
//@ComponentScan(basePackageClasses = {UserController.class})
//@EntityScan(basePackages = "com.springBootHibernate.domain")
//@EnableJpaRepositories(basePackages = "com.springBootHibernate.domain")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
