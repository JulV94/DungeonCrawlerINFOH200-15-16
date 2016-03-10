package com.gmail.julvdev.DungeonCrawler.model;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by julien on 9/03/16.
 * Map of the game generated from a file
 */
public class Map {

    private static Tile map[][];
    private static int length=0, height=1;

    public Map(File mapFile) throws IOException {
        ArrayList<String> ids = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(mapFile));
        String line;
        String[] lineSplitted;
        if ((line = br.readLine()) != null) {
            lineSplitted = line.trim().split(" ");
            Collections.addAll(ids, lineSplitted);
            length=lineSplitted.length;
        }
        while ((line = br.readLine()) != null) {
            height++;
            lineSplitted = line.trim().split(" ");
            Collections.addAll(ids, lineSplitted);
        }
        map = new Tile[length][height];
        for (int i=0; i<ids.size(); i++) {
            map[i%length][i/length] = new Tile(TileType.getById(Integer.parseInt(ids.get(i))));
        }
    }

    public static Tile getTile(int x, int y) {
        return map[x][y];
    }

    public static int getLength() {
        return length;
    }

    public static int getHeight() {
        return height;
    }
}
