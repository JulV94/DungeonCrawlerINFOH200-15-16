package com.gmail.julvdev.DungeonCrawler.controller;

import com.gmail.julvdev.DungeonCrawler.model.GameModel;
import com.gmail.julvdev.DungeonCrawler.observerpattern.Observable;
import com.gmail.julvdev.DungeonCrawler.observerpattern.Observer;
import com.gmail.julvdev.DungeonCrawler.observerpattern.Update;
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
    public void update(String str, Update target) {
        switch (target) {
            case MODEL:
                this.model.update(str);
                break;
            case VIEW:
                this.view.update(str);
                break;
        }
    }
}
