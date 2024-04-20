/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package farenheittocelsius;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class FarenheitToCelsius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the farenheit to calculate: ");
        double farenheit = input.nextDouble();
        
        //Farenheit to Celsius
        double celsius = ((5.0 / 9) * (farenheit - 32));
        System.out.println( farenheit + " Farenheit " + "is equivalent to " + celsius + " Celsius.");
    }
    
}
