package com.gmail.julvdev.DungeonCrawler;

import com.gmail.julvdev.DungeonCrawler.controller.Controller;
import com.gmail.julvdev.DungeonCrawler.model.GameModel;
import com.gmail.julvdev.DungeonCrawler.view.GameFrame;

/**
 * Created by julien on 7/03/16.
 * main file
 */
public class DungeonCrawler {
    public static void main(String[] args) {
        new Controller(new GameModel(), new GameFrame("Dungeon Crawler"));
    }
}
