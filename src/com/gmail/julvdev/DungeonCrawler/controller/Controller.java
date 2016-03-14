package com.gmail.julvdev.DungeonCrawler.controller;

import com.gmail.julvdev.DungeonCrawler.observerpattern.Observable;
import com.gmail.julvdev.DungeonCrawler.observerpattern.Observer;

/**
 * Created by julien on 10/03/16.
 * Controller
 */
public class Controller implements Observer {

    private Observable model;
    private Observable view;

    public Controller(Observable model, Observable view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void update(String str) {

    }
}
