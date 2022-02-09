/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package midterm1;
import java.math.BigDecimal;
import java.util.*;
/**
 *
 * @author HP 14-CD0003NE
 */
public class Midterm1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to the Planet and moon Database handler");
        int choice=0;
        Scanner choiceScanner = new Scanner(System.in);
        Scanner dataScanner = new Scanner(System.in);
        Database database = new Database();
        boolean dwarf;
        do {
        System.out.println("----------------------------------------");
        System.out.println("1. Add a planet to the database");
        System.out.println("2. Add a moon to the database");
        System.out.println("3. Modify planet data");
        System.out.println("4. Modify moon data");
        System.out.println("5. Exit ");
        System.out.println("Please enter a choice(1-5): ");
        choice = choiceScanner.nextInt();
        
        if (choice == 1){
            System.out.println("Please enter name of the planet: ");
            String planetName = dataScanner.next();
            
            
            System.out.println("Please enter mass of the planet: ");
            BigDecimal mass = dataScanner.nextBigDecimal();
            
            
            System.out.println("Please enter radius of the planet: ");
            Double radius = dataScanner.nextDouble();
            
            
            System.out.println("Please enter orbital distance of the planet: ");
            BigDecimal orbitalDist = dataScanner.nextBigDecimal();
            
            
            System.out.println("Please enter day length of the planet (hours): ");
            Double dayLength = dataScanner.nextDouble();
            
            
            System.out.println("Please enter the name of the sun the planet orbits: ");
            String sunName = dataScanner.next();
            
            
            System.out.println("Please indicate if planet is dwarf or not (y/n): ");
            String sdwarf = dataScanner.next();
            
            
            if (sdwarf.equals("y")){
                dwarf = true;
            }
            else{
                dwarf = false;
            }
            
            Atmosphere planetAtmos = new Atmosphere();
            planetAtmos = getAtmosphere(planetAtmos);
            Planet planetData = new Planet(mass, radius, orbitalDist,dayLength,planetAtmos, dwarf, sunName);
            database.addPlanet(planetName,planetData);
        }
        if (choice == 2){
            System.out.println("Please enter name of the moon: ");
            String moonName = dataScanner.next();
            
            
            System.out.println("Please enter mass of the moon: ");
            BigDecimal mass = dataScanner.nextBigDecimal();
            
            
            System.out.println("Please enter radius of the moon: ");
            Double radius = dataScanner.nextDouble();
            
            
            System.out.println("Please enter orbital distance of the moon: ");
            BigDecimal orbitalDist = dataScanner.nextBigDecimal();
            
            
            System.out.println("Please enter day length of the moon (hours): ");
            Double dayLength = dataScanner.nextDouble();
            
            
            System.out.println("Please enter the name of the planet the moon orbits: ");
            String planetName = dataScanner.next();
            Atmosphere moonAtmos = new Atmosphere();
            moonAtmos = getAtmosphere(moonAtmos);
            Moon moon = new Moon(mass, radius, orbitalDist, dayLength, planetName, moonAtmos);
            database.addMoon(moonName, moon);
        }
        if (choice == 3){
        System.out.println("Please search for a planet using its name.....");
        System.out.println("Please enter a name: ");
        String planetName = dataScanner.next();

        Planet planet = database.searchPlanet(planetName);
        if ( planet != null){
            System.out.println("Planet "+planetName+ " was found!");
            System.out.println("Here is the existing data -->");
            System.out.println("1. Name -> " + planetName);
            System.out.println("2. Mass(kg) -> "+planet.getMass());
            System.out.println("3. Radius(km) ->"+planet.getRadius());
            System.out.println("4. Orbital distance(km) ->"+planet.getOrbitalDist());
            System.out.println("6. DayLength ->"+planet.getDayLength());
            String isDwarf;
            if (planet.isDwarf() == true){
                isDwarf = "YES";
            }
            else{
                isDwarf = "NO";
            }
            System.out.println("7. IS dwarf ->"+isDwarf);
            System.out.println("8. Sun Name ->"+planet.getSunName());
            System.out.println("9. Thickness of Atmosphere -->"+planet.getPlanetAtmos().getThickness());
            System.out.println("10. Density of Atmosphere ->"+planet.getPlanetAtmos().getDensity());
            System.out.println("11. List of chemicals --> ");
            //planet.planetAtmos.displayChems(planet.planetAtmos);
        }
        else{System.out.println("Planet not found in database....");}
        }
        if (choice == 4){
        
        }
        
        
        
    }while(choice!=5);
    
}
    private static Atmosphere getAtmosphere(Atmosphere atmos){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter thickness of the atmosphere(km): ");
        Double thickness = sc.nextDouble();
        atmos.setThickness(thickness);
        System.out.println("Please enter density of the atmosphere(kg/m^3): ");
        Double density = sc.nextDouble();
        atmos.setDensity(density);
        System.out.println("Add chemical compounds for the atmosphere?(y/n): ");
        String choice = sc.next();
        if ("y".equals(choice)){
            while("n".equals(choice) == false){
                System.out.println("Please enter the name of Chemical: ");
                String cName = sc.next();
                System.out.println("Please enter the percent composition of Chemical: ");
                Double percent = sc.nextDouble();
                //System.out.println(cName+percent);
                atmos.addCompund(cName, percent);
                System.out.println("Add more compounds?(y/n): ");
                choice = sc.next();
            }
        }
        
        else{
            return atmos;
        }
        return atmos;
}
}
