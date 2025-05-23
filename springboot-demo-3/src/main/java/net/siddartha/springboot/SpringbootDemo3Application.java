package net.siddartha.springboot;

import net.siddartha.loggingdemo.component.DemoBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
  
@SpringBootApplication
public class SpringbootDemo3Application {

    public static final Logger logger = LoggerFactory.getLogger(SpringbootDemo3Application.class);

    public static void main(String[] args) {
        logger.debug("Welcome to Spring Concept Demo");

        ApplicationContext context = SpringApplication.run(SpringbootDemo3Application.class, args);

        logger.debug("Checking Context: {}", context.getBean(DemoBean.class));
        logger.debug("**** Example Using @Autowired annotation on property ****");
    }
}
