package practice04;

import java.util.Scanner;

public class C04FahrenheitToCelsius {

    public static void main(String[] args) {
        // Fahrenheit değerini, Celsius değere çeviren method
        // formül: c = (f-32)/1.8

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter Celcius value.");
        double fahrenheit = scan.nextDouble();

        double celsius = fahrenheitToCelsius(fahrenheit);
        System.out.println("fahrenheit = " + fahrenheit);
        System.out.println("celsius = " + celsius);

    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        // formül: c = (f-32)/1.8
        double celsius = (fahrenheit - 32) / 1.8;

        return celsius;

    }
}