package com.capg.bookmydr;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class BookmydrApplicationTests {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void contextLoads() {
        // Verify that the application context loads successfully
        assertThat(applicationContext).isNotNull();
    }

    @Test
    void testSpecificBeanLoads() {
        // Replace 'YourBeanName' with an actual bean name or class in your application
        boolean beanExists = applicationContext.containsBean("yourBeanName");
        assertThat(beanExists).isTrue();
    }
}
