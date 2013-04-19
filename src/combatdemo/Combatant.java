/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package combatdemo;

import java.awt.Image;

/**
 *
 * @author kevin.lawrence
 */
public class Combatant {

    public Combatant(int health, String name, Image image) {
        this.health = health;
        this.name = name;
        this.image = image;
    }
    
    //<editor-fold defaultstate="collapsed" desc="Properties">
    private int health;
    private String name = "";
    private Image image;

    /**
     * @return the health
     */
    public int getHealth() {
        return health;
    }

    /**
     * @param health the health to set
     */
    public void setHealth(int health) {
        this.health = health;
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
     * @return the image
     */
    public Image getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(Image image) {
        this.image = image;
    }
    //</editor-fold>
}
