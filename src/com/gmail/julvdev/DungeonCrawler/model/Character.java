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

    public Character(BufferedImage img, Inventory inventory, int maxLife, int life) {
        this.img = img;
        this.inventory = inventory;
        this.maxLife = maxLife;
        this.life = life;
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


    public int getLife() {
        return life;
    }

    public int getMaxLife() {
        return maxLife;
    }
}
