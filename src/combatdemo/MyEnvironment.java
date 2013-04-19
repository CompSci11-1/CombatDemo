/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package combatdemo;

import environment.Environment;
import image.ResourceTools;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author kevin.lawrence
 */
public class MyEnvironment extends Environment {
    
    public MyEnvironment(Image background){
        super(background);
        System.out.println("create with image");
    }

    public MyEnvironment() {
        System.out.println("create");
    }

    @Override
    public void initializeEnvironment() {
    }

    @Override
    public void timerTaskHandler() {
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_1) {
            newWindow("A New Frame");
        } else if (e.getKeyCode() == KeyEvent.VK_2) {
            newDialog("A New Dialog");
        } else if (e.getKeyCode() == KeyEvent.VK_3) {
            newCombatVisualizer("Combat Visualizer");
        }

    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        System.out.println("painting");
        Font font = new Font("Calibri", Font.BOLD + Font.ITALIC, 20);
        graphics.setFont(font);
        graphics.setColor(Color.WHITE);
        graphics.drawString("Press: ", 10, 20);
        graphics.drawString(" '1' for a Frame,", 10, 40);
        graphics.drawString(" '2' for a modal Dialog, or", 10, 60);
        graphics.drawString(" '3' for a custom modal Combat Dialog!", 10, 80);
        
    }

    private void newWindow(String title) {
        JFrame frame = new JFrame(title);

        CombatPanel cp = new CombatPanel();
        frame.add(cp);
        frame.setAlwaysOnTop(true);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(new Dimension(400, 600));
        frame.setVisible(true);
    }

    private void newDialog(String title) {
        JDialog dialog;
        dialog = new JDialog();

        dialog.setModal(true);
        dialog.setTitle(title);

        CombatPanel cp = new CombatPanel();
        dialog.add(cp);
        dialog.setAlwaysOnTop(true);

        dialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dialog.setSize(new Dimension(400, 600));
        dialog.setVisible(true);
    }

    private void newCombatVisualizer(String title) {
        JDialog dialog;
        dialog = new JDialog();

        dialog.setModal(true);
        dialog.setTitle(title);

        Combatant friend = new Combatant(100, "Charizard", ResourceTools.loadImageFromResource("resources/charizard.png"));
        Combatant enemy = new Combatant(100, "Ninetails", ResourceTools.loadImageFromResource("resources/ninetails.png"));

        CombatVisualizer cv = new CombatVisualizer(friend, enemy);
        dialog.add(cv);
        dialog.setAlwaysOnTop(true);

        dialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dialog.setSize(new Dimension(700, 500));
        dialog.setVisible(true);
    }
}
