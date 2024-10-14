/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roadsconstructed_ui_;

/**
 *
 * @author damia
 */
public abstract class RoadsConstructed implements IRoadsConstructed{
    
    
    private  String city;
    private  int TotalRoadsConstructed;

    public RoadsConstructed(String city, int totalRoads) {
        this.city = city;
        this.TotalRoadsConstructed = totalRoads;
    }

    @Override
    public String getCity() {
        return city;
    }

   
    @Override
    public int getTotalRoadsConstructed() {
        return TotalRoadsConstructed;
    }
    
    
    
    
    
}
