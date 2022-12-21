/*
 * Author Name: Philip Meshach
 * Date: 21-12-2022
 * Praise The Lord
 */
package org.niit.ProductConfig;

import org.niit.Domin.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class ProductConfig {

    @Bean
    public Product getDetails(){
        return new Product("Hp Pavilion",1,70000);
    }
}
