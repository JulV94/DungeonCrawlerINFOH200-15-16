package com.gmail.julvdev.DungeonCrawler.model;

import com.gmail.julvdev.DungeonCrawler.controller.Controller;
import com.gmail.julvdev.DungeonCrawler.model.interfaces.ControllerInterface;
import com.gmail.julvdev.DungeonCrawler.model.interfaces.ViewInterface;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

/**
 * Created by julien on 10/03/16.
 * Model of the game
 */
public class GameModel {

    private ControllerInterface controllerInterface;
    private Player player;
    private ViewInterface viewInterface;

    public GameModel(ViewInterface view) {
        controllerInterface = new Controller(this);
        viewInterface = view;
        try {
            player = new Player(ImageIO.read(new File("img/player.png")), new Inventory(), 100, 100, new Location(1, 1));
        } catch (IOException e) {
            e.printStackTrace();
            System.err.print("Texture of the player not found");
        }
    }

    public Player getPlayer() {
        return player;
    }

}
