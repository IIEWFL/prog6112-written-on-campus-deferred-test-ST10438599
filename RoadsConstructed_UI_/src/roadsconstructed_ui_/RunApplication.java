/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roadsconstructed_ui_;

import java.util.Scanner;

/**
 *
 * @author damia
 */
public class RunApplication {
    
    
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //gathering input from the user
        System.out.println("Enter the city for road construction:" );
        String city = input.next();
        System.out.println("Enter the city for road construction:" );
        int totalRoads= input.nextInt();
        
        //instantiated subclass to access the methods required
        RoadConstructionReport obj = new RoadConstructionReport(city,totalRoads);
        
        
        
        obj.printRoadsConstructedReport();
        
        
        
    }
    
    
    
}
