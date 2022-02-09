/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm1;

/**
 *
 * @author HP 14-CD0003NE
 */
public class Chemical {
    private String chemical;
    private Double percent;
    
    public Chemical(String chemical, Double percent){
        this.chemical = chemical;
        this.percent = percent;
    }

    public String getChemical() {
        return chemical;
    }

    public void setChemical(String chemical) {
        this.chemical = chemical;
    }

    public Double getPercent() {
        return percent;
    }

    public void setPercent(Double percent) {
        this.percent = percent;
    }
}
