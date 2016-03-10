package com.gmail.julvdev.DungeonCrawler.model;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by julien on 9/03/16.
 * Type defined for the tile
 */
public enum TileType {
    VOID(0, "img/tiles/void.png", false),
    GRASS(1, "img/tiles/grass.png", true),
    DIRT(2, "img/tiles/dirt.png", true),
    GRAVEL(3, "img/tiles/gravel.png", true),
    BRICK_WALL(4, "img/tiles/brick_wall.png", false),
    STONE_WALL(5, "img/tiles/stone_wall.png", false);

    private int id;
    private BufferedImage img;
    private boolean crossable;

    TileType(int id, String imgPath, boolean crossable) {
        this.id=id;
        try {
            img = ImageIO.read(new File(imgPath));
        } catch (IOException e) {
            e.printStackTrace();
            System.err.print("Wrong file specified in the TileType enumeration.");
        }
        this.crossable = crossable;
    }

    public static TileType getById(int id) {
        for(TileType e : values()) {
            if(e.id == id) return e;
        }
        return null;
    }

    public boolean isCrossable() {
        return crossable;
    }
}