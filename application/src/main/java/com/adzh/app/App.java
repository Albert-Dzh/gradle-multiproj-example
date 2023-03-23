package com.adzh.app;

import com.adzh.lib.TestLibClass;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        var testLib = new TestLibClass(10);
        log.info(String.format("The 'c' val from TestLibClass : %d", testLib.getC()));
        log.info(String.format("The 'someString' val from TestLibClass : %s", testLib.getSomeString()));
        SpringApplication.run(App.class, args);
    }
}
