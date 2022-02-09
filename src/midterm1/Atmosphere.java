/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rithik Lalchandani
 */
public class Atmosphere {
    private Double density;
    private Double thickness;
    private List<Chemical> chemData = new ArrayList<Chemical>();
    
 /*   public Atmosphere(Double density, Double thickness, List<String> chemData){
        this.density = density;
        this.thickness = thickness;
        this.chemData = chemData;
}
    */
    
    
    public void addCompund(String gas, Double percent){
        Chemical compound = new Chemical(gas, percent);
        chemData.add(compound);
    }
  /*  public void displayChems(List<Chemical>chemData){
        for i in 
    }*/

    public Double getDensity() {
        return density;
    }

    public void setDensity(Double density) {
        this.density = density;
    }

    public Double getThickness() {
        return thickness;
    }

    public void setThickness(Double thickness) {
        this.thickness = thickness;
    }

    public List<Chemical> getChemData() {
        return chemData;
    }

    public void setChemData(List<Chemical> chemData) {
        this.chemData = chemData;
    }
    
}




