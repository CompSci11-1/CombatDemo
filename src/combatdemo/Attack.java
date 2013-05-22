/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package combatdemo;

/**
 *
 * @author kevin.lawrence
 */
public class Attack {
    
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Attack(String name){
        this.name = name;
    }
    
    public Attack(String name, int minimumDamage, int maximumDamage, double hitProbability){
        this.name = name;
        this.minimumDamage = minimumDamage;
        this.maximumDamage = maximumDamage;
        this.hitProbability = hitProbability;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Properties">
    private int minimumDamage = 0;
    private int maximumDamage = 100;
    private String name = "";
    private double hitProbability = 0.5;
    
    /**
     * @return the minimumDamage
     */
    public String getDisplay() {
        return String.format("%s [%d - %d: %.0f%%]", name, minimumDamage, maximumDamage, hitProbability * 100);
    }
    
    /**
     * @return the minimumDamage
     */
    public int getMinimumDamage() {
        return minimumDamage;
    }
    
    /**
     * @param minimumDamage the minimumDamage to set
     */
    public void setMinimumDamage(int minimumDamage) {
        this.minimumDamage = minimumDamage;
    }
    
    /**
     * @return the maximumDamage
     */
    public int getMaximumDamage() {
        return maximumDamage;
    }
    
    /**
     * @param maximumDamage the maximumDamage to set
     */
    public void setMaximumDamage(int maximumDamage) {
        this.maximumDamage = maximumDamage;
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * @return the hitProbability
     */
    public double getHitProbability() {
        return hitProbability;
    }
    
    /**
     * @param hitProbability the hitProbability to set
     */
    public void setHitProbability(double hitProbability) {
        this.hitProbability = hitProbability;
    }
    //</editor-fold>
    
}
