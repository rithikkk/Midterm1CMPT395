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
public class Moon {
    private String name;
    private BigDecimal mass;
    private Double radius;
    private BigDecimal orbitalDist;
    private Double dayLength;
    private  String  planetName;
    private Atmosphere moonAtmos;
    
    public Moon(BigDecimal mass, Double radius, BigDecimal orbitalDist,
            Double dayLength, String planetName, Atmosphere moonAtmos){
    this.mass = mass;
    this.radius = radius;
    this.orbitalDist = orbitalDist;
    this.dayLength = dayLength;
    this.planetName = planetName;
    this.moonAtmos = moonAtmos;
       }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getMass() {
        return mass;
    }

    public void setMass(BigDecimal mass) {
        this.mass = mass;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public BigDecimal getOrbitalDist() {
        return orbitalDist;
    }

    public void setOrbitalDist(BigDecimal orbitalDist) {
        this.orbitalDist = orbitalDist;
    }

    public Double getDayLength() {
        return dayLength;
    }

    public void setDayLength(Double dayLength) {
        this.dayLength = dayLength;
    }

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public Atmosphere getMoonAtmos() {
        return moonAtmos;
    }

    public void setMoonAtmos(Atmosphere moonAtmos) {
        this.moonAtmos = moonAtmos;
    }
    
}
