/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package combatdemo;

import environment.ApplicationStarter;
import image.ResourceTools;
import java.awt.Image;

/**
 *
 * @author kevin.lawrence
 */
public class CombatDemoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        startApplication();
    }

    private static void startApplication() {
//        ApplicationStarter.run("Test Frame", new MyEnvironment(null));
        Image background = ResourceTools.loadImageFromResource("resources/charizard_background.jpg");
        MyEnvironment me = new MyEnvironment(background);
        me.newCombatVisualizer("Combat Visualizer");
        ApplicationStarter.run("Combat Demo", me);
//        ApplicationStarter.run("Combat Demo", new MyEnvironment(background));
    }
}
