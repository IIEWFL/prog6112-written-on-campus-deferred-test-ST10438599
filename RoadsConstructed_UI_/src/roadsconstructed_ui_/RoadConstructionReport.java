/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roadsconstructed_ui_;

/**
 *
 * @author damia
 */
public class RoadConstructionReport extends RoadsConstructed{
    
    public RoadConstructionReport(String city, int totalRoads) {
        super(city, totalRoads);
    }
    
    //Report ordered in correct output
    public void printRoadsConstructedReport(){
        
        
        String header = "ROAD CONSTRUCTION REPORT";
        String asterix = "**************************************";
        
        System.out.println("\n\n" + header);
        System.out.println(asterix);
        System.out.println("CITY: " + getCity());
        System.out.println("ROADS CONSTRUCTED: " + getTotalRoadsConstructed());
        System.out.println(asterix);
        
        
    }
    
    
}
