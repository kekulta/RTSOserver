/**
 * Created by Виталий on 15.12.2017.
 */
import java.io.Serializable;
import java.util.LinkedList;

public class Hero implements Serializable{
    private String name;
    private int x, y, health, side;
    private item[] inventory = new item[3];
    public Hero(String name, int x, int y, int health, int side, item[] inventory){
        this.name = name;
        this.x = x;
        this.y = y;
        this.health = health;
        this.side = side;
        this.inventory = inventory;
    }
    public String getName(){
        return name;
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setHealth(int health){
        this.health = health;
    }
    public void setSide(int side){
        this.side = side;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public int getHealth() {
        return this.health;
    };
    public int getSide(){
        return this.side;
    }
    public item[] getInventory() {
        return this.inventory;
    }
}
//git comment