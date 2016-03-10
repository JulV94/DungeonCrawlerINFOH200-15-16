package com.gmail.julvdev.DungeonCrawler.controller;

import com.gmail.julvdev.DungeonCrawler.model.GameModel;
import com.gmail.julvdev.DungeonCrawler.model.interfaces.ControllerInterface;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by julien on 10/03/16.
 * Controller
 */
public class Controller implements KeyListener, ControllerInterface {

    private GameModel model;

    public Controller(GameModel model) {
        this.model = model;
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
        playerMove(1, 0);
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        playerMove(1, 0);
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        playerMove(1, 0);
    }

    @Override
    public void playerMove(int x, int y) {
        model.getPlayer().move(x, y);
    }
}
