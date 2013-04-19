/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package combatdemo;

/**
 *
 * @author kevin.lawrence
 */
public class CombatVisualizer extends CombatPanel {
    /*
     * Put all you business logic in here...
     */
    
    public CombatVisualizer(Combatant friend, Combatant enemy){
        this.friend = friend;
        this.enemy = enemy;
        
        initialize();
    }
    
    private void initialize() {
        if (friend != null){
            setFriendName(friend.getName());
            setFriendImage(friend.getImage());
        }
        
        if (enemy != null){
            setEnemyName(enemy.getName());
            setEnemyImage(enemy.getImage());
        }
        
        
    }
    
    
    //<editor-fold defaultstate="collapsed" desc="Properties">
    private Combatant friend, enemy;
    
    /**
     * @return the friend
     */
    public Combatant getFriend() {
        return friend;
    }
    
    /**
     * @param friend the friend to set
     */
    public void setFriend(Combatant friend) {
        this.friend = friend;
    }
    
    /**
     * @return the enemy
     */
    public Combatant getEnemy() {
        return enemy;
    }
    
    /**
     * @param enemy the enemy to set
     */
    public void setEnemy(Combatant enemy) {
        this.enemy = enemy;
    }
    //</editor-fold>

 
}
