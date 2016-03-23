package com.gmail.julvdev.DungeonCrawler.model;

import com.gmail.julvdev.DungeonCrawler.model.Items.Armor;
import com.gmail.julvdev.DungeonCrawler.model.Items.Weapon;

import java.awt.image.BufferedImage;

/**
 * Created by julien on 9/03/16.
 * Character in the game
 */
public class Character {

    private BufferedImage img;
    private Inventory inventory;
    private Weapon weapon = null;
    private Armor armor = null;
    private int maxLife, life;
    protected Location location;
    private String name="";

    public Character(BufferedImage img, Inventory inventory, int maxLife, int life, Location location) {
        this.img = img;
        this.inventory = inventory;
        this.maxLife = maxLife;
        this.life = life;
        this.location = location;
    }

    public void move(int x, int y) {
        location.x += x;
        location.y += y;
        System.out.println("Your location is ("+String.valueOf(x)+", "+ String.valueOf(y)+")");
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void setMaxLife(int maxLife) {
        this.maxLife = maxLife;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public int getMaxLife() {
        return maxLife;
    }

    public Location getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }
}
