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
    GRASS("img/tiles/grass.png", true),
    DIRT("img/tiles/dirt.png", true),
    GRAVEL("img/tiles/gravel.png", true),
    BRICK_WALL("img/tiles/brick_wall.png", false),
    STONE_WALL("img/tiles/stone_wall.png", false);

    private BufferedImage img;
    private boolean crossable;

    TileType(String imgPath, boolean crossable) throws IOException {
        img = ImageIO.read(new File(imgPath));
        this.crossable = crossable;
    }
}