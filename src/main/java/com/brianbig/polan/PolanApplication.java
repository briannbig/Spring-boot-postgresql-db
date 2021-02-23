package com.brianbig.polan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import javax.sql.DataSource;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class PolanApplication {

    public static void main(String[] args) {
        SpringApplication.run(PolanApplication.class, args);
    }

}
