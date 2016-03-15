package com.gmail.julvdev.DungeonCrawler.model;

import com.gmail.julvdev.DungeonCrawler.controller.Controller;
import com.gmail.julvdev.DungeonCrawler.observerpattern.Observable;
import com.gmail.julvdev.DungeonCrawler.observerpattern.Observer;
import com.gmail.julvdev.DungeonCrawler.observerpattern.Update;

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

    public void update(String str){
        if (str.equals("mvPlayer")) {
            System.out.println("Player is moving in model");
            notifyObserver("mvPlayer", Update.VIEW);
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
    public void notifyObserver(String str, Update target) {
        if(str.matches("^0[0-9]+")) {
            str = str.substring(1, str.length());
        }

        for(Observer obs : listObserver) {
            obs.update(str, target);
        }
    }
}
