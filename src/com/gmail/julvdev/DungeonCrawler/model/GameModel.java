package com.gmail.julvdev.DungeonCrawler.model;

import com.gmail.julvdev.DungeonCrawler.controller.Controller;
import com.gmail.julvdev.DungeonCrawler.observerpattern.Observable;
import com.gmail.julvdev.DungeonCrawler.observerpattern.Observer;
import com.gmail.julvdev.DungeonCrawler.observerpattern.TargetType;
import com.gmail.julvdev.DungeonCrawler.observerpattern.Updater;

import java.util.ArrayList;

/**
 * Created by julien on 10/03/16.
 * Model of the game
 */
public class GameModel implements Observable {

    private ArrayList<Observer> listObserver = new ArrayList<>();
    private Player player;

    public GameModel(Controller controller) {
        addObserver(controller);
    }

    public void update(Updater obj){
        if (obj.getAction().equals("mvPlayer")) {
            System.out.println("Player is moving in model");
            notifyObserver(new Updater(TargetType.VIEW, "mvPlayer"));
        }
    }

    // Observer part
    @Override
    public void addObserver(Observer obs) {
        this.listObserver.add(obs);
    }

    @Override
    public void removeObserver() {
        this.listObserver = new ArrayList<>();
    }

    @Override
    public void notifyObserver(Updater obj) {

        for(Observer obs : listObserver) {
            obs.update(obj);
        }
    }
}
