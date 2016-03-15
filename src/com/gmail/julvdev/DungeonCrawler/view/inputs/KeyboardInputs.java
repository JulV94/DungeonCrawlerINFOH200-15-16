package com.gmail.julvdev.DungeonCrawler.view.inputs;

import com.gmail.julvdev.DungeonCrawler.controller.Controller;
import com.gmail.julvdev.DungeonCrawler.observerpattern.Observable;
import com.gmail.julvdev.DungeonCrawler.observerpattern.Observer;
import com.gmail.julvdev.DungeonCrawler.observerpattern.Update;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

/**
 * Created by julien on 15/03/16.
 * Listen to the inputs from the keyboard
 */
public class KeyboardInputs implements KeyListener, Observable {

    private ArrayList<Observer> listObserver = new ArrayList<>();

    public KeyboardInputs(Controller controller) {
        addObserver(controller);
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        switch (keyEvent.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                notifyObserver("mvPlayer", Update.MODEL);
                break;
            case KeyEvent.VK_RIGHT:
                notifyObserver("mvPlayer", Update.MODEL);
                break;
            case KeyEvent.VK_UP:
                notifyObserver("mvPlayer", Update.MODEL);
                break;
            case KeyEvent.VK_DOWN:
                notifyObserver("mvPlayer", Update.MODEL);
                break;
            case KeyEvent.VK_ESCAPE:
            case KeyEvent.VK_P:
                break;
            case KeyEvent.VK_SPACE:
                break;
        }

    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
    }

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
