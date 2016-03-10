package com.gmail.julvdev.DungeonCrawler.model;

import java.awt.image.BufferedImage;

/**
 * Created by julien on 9/03/16.
 * Player controlled
 */
public class Player extends Character {


    public Player(BufferedImage img, Inventory inventory, int maxLife, int life, Location location) {
        super(img, inventory, maxLife, life, location);
    }


}
