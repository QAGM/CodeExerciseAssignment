package com.amazon.selenium.configurations;

import com.amazon.selenium.SpringBootBasicApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = SpringBootBasicApplication.class)
public class CucumberSpringConfig {
}
