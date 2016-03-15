package com.gmail.julvdev.DungeonCrawler.view;

import com.gmail.julvdev.DungeonCrawler.controller.Controller;
import com.gmail.julvdev.DungeonCrawler.observerpattern.Observable;
import com.gmail.julvdev.DungeonCrawler.observerpattern.Observer;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by julien on 10/03/16.
 * Frame containing a game
 */
public class GameFrame extends JFrame implements Observable {

    private ArrayList<Observer> listObserver = new ArrayList<>();
    private MapPanel mapPanel;
    private HUDPanel hudPanel;

    public GameFrame(String title,Controller controller) {
        super(title);

        this.setSize(new Dimension(800, 800));
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(this.getParent());

        hudPanel = new HUDPanel();
        mapPanel = new MapPanel();

        JPanel layout = new JPanel(new BorderLayout());
        layout.add(hudPanel, BorderLayout.NORTH);
        layout.add(mapPanel, BorderLayout.CENTER);

        this.setContentPane(layout);
        this.setVisible(true);
        listObserver.add(controller);
    }
    public void update(String str){

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
    public void notifyObserver(String str) {
        if(str.matches("^0[0-9]+")) {
            str = str.substring(1, str.length());
        }

        for(Observer obs : listObserver) {
            obs.update(str,false);
        }
    }
}
