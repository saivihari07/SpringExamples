package com.dependancyinjection.ConstructorDependancyInjection;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 

 
public class Color {
 
    public static void main(String a[]){
         
        
        ApplicationContext context 
                        = new ClassPathXmlApplicationContext("config.xml");
        MainColor mainColor = context.getBean("colorManager",MainColor.class);
        mainColor.pringColor();
    }
}
