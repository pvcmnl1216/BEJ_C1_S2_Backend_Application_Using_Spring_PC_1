package org.niit;

import org.niit.Domin.Product;
import org.niit.ProductConfig.ProductConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ProductConfig.class);
        Product pud = applicationContext.getBean(Product.class);
        System.out.println("pud = " + pud);
    }
}
