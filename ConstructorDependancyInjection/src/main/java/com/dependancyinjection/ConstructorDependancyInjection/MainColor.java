package com.dependancyinjection.ConstructorDependancyInjection;


public class MainColor {
	 
    MyColor color;
     
    public void pringColor(){
        this.color.printColor();
    }
     
    public MainColor(MyColor myColor){
        this.color = myColor;
    }
}
