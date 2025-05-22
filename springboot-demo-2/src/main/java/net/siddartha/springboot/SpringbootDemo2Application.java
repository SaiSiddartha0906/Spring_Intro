package net.siddartha.springboot;

import net.siddartha.springboot.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootDemo2Application implements CommandLineRunner {

    @Autowired
    private ApplicationContext applicationContext;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemo2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    	Employee employee = applicationContext.getBean(Employee.class);
    	employee.displayEmployeeInfo();
    }
}