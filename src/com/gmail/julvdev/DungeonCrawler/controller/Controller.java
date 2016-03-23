package com.gmail.julvdev.DungeonCrawler.controller;

import com.gmail.julvdev.DungeonCrawler.model.GameModel;
import com.gmail.julvdev.DungeonCrawler.observerpattern.Observer;
import com.gmail.julvdev.DungeonCrawler.observerpattern.TargetType;
import com.gmail.julvdev.DungeonCrawler.observerpattern.Updater;
import com.gmail.julvdev.DungeonCrawler.view.GameFrame;

/**
 * Created by julien on 10/03/16.
 * Controller
 */
public class Controller implements Observer {

    private GameModel model;
    private GameFrame view;

    public Controller() {
    }

    public void setModel(GameModel model){
        this.model = model;
    }

    public void setView(GameFrame view){
        this.view = view;
    }

    @Override
    public void update(Updater obj) {
        switch (obj.getTarget()) {
            case MODEL:
                this.model.update(obj);
                break;
            case VIEW:
                this.view.update(obj);
                break;
        }
    }
}
