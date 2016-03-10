package com.gmail.julvdev.DungeonCrawler.model;

import com.gmail.julvdev.DungeonCrawler.model.Items.Item;

import java.util.ArrayList;

/**
 * Created by julien on 9/03/16.
 * Inventory of a character
 */
public class Inventory {

    private ArrayList<Item> items;

    public Inventory() {
        // Empty inventory
    }

    public Inventory(ArrayList<Item> items) {
        this.items = items;
    }
}
