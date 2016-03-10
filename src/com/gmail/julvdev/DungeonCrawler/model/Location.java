package com.gmail.julvdev.DungeonCrawler.model;

import java.awt.*;

/**
 * Created by julien on 10/03/16.
 * Location object
 */
public class Location {

    public int x, y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Dimension toDimension() {
        return new Dimension(x, y);
    }
}
