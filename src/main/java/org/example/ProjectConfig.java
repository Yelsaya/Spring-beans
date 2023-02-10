package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "org.example")
public class ProjectConfig {
    ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

    Person person = new Person();
    Parrot parrot = new Parrot();

}
