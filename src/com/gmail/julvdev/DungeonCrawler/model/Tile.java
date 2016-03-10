package com.gmail.julvdev.DungeonCrawler.model;

import com.gmail.julvdev.DungeonCrawler.model.Items.Item;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by julien on 9/03/16.
 * One tile of the map
 */
public class Tile {

    private TileType type;
    private Dimension size;
    private ArrayList<Item> items;

    public Tile(TileType type) {
        this.type = type;
        size = new Dimension(64, 64);
    }

    public boolean isCrossable() {
        return type.isCrossable();
    }
}
