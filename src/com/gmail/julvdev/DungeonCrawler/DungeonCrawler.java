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
        Controller controller = new Controller();
        GameModel game = new GameModel(controller);
        controller.setModel(game);
        GameFrame frame = new GameFrame("Dungeon Crawler",controller);
        controller.setView(frame);
    }
}
