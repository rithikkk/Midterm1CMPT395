/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm1;

import java.math.BigDecimal;

/**
 *
 * @author Rithik Lalchandani
 */
public class Planet {
    private BigDecimal mass;
    private Double radius;
    private BigDecimal orbitalDist;
    private Double dayLength;
    private Atmosphere planetAtmos;
    private boolean dwarf;
    private String sunName;
    

    
    public Planet(BigDecimal mass, Double radius, BigDecimal orbitalDist, 
            Double dayLength, Atmosphere planetAtmos, boolean dwarf, String sunName){
        this.mass = mass;
        this.radius = radius;
        this.orbitalDist = orbitalDist;
        this.dayLength = dayLength;
        this.planetAtmos = planetAtmos;
        this.dwarf = dwarf;
        this.sunName = sunName;
    }

    public BigDecimal getMass() {
        return mass;
    }

    public Double getRadius() {
        return radius;
    }

    public BigDecimal getOrbitalDist() {
        return orbitalDist;
    }

    public Double getDayLength() {
        return dayLength;
    }

    public Atmosphere getPlanetAtmos() {
        return planetAtmos;
    }

    public boolean isDwarf() {
        return dwarf;
    }

    public String getSunName() {
        return sunName;
    }

    public void setMass(BigDecimal mass) {
        this.mass = mass;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public void setOrbitalDist(BigDecimal orbitalDist) {
        this.orbitalDist = orbitalDist;
    }

    public void setDayLength(Double dayLength) {
        this.dayLength = dayLength;
    }

    public void setPlanetAtmos(Atmosphere planetAtmos) {
        this.planetAtmos = planetAtmos;
    }

    public void setDwarf(boolean dwarf) {
        this.dwarf = dwarf;
    }

    public void setSunName(String sunName) {
        this.sunName = sunName;
    }
    
    
}
