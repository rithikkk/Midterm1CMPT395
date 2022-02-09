/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm1;

import java.util.*;

/**
 *
 * @author Rithik Lalchandani
 */
public class Database {
    //public Planet planet;
    //public Moon moon;
    private Hashtable<String,Planet> planetDB = new Hashtable<String, Planet>();
    private Hashtable<String,Moon> moonDB = new Hashtable<String, Moon>();
    

    public void addPlanet(String planetName, Planet planet){
       planetDB.put(planetName, planet);
    }
    
    
    public void addMoon(String moonName, Moon moon){
       moonDB.put(moonName, moon);
    }
    
    public Planet searchPlanet(String planetName){
        if (planetDB.containsKey(planetName) == true){return planetDB.get(planetName);}
        else{return null;}
            
    }
    
    public void searchMoon(){
        
    }

    public Hashtable<String, Planet> getPlanetDB() {
        return planetDB;
    }

    public void setPlanetDB(Hashtable<String, Planet> planetDB) {
        this.planetDB = planetDB;
    }

    public Hashtable<String, Moon> getMoonDB() {
        return moonDB;
    }

    public void setMoonDB(Hashtable<String, Moon> moonDB) {
        this.moonDB = moonDB;
    }
    
}
