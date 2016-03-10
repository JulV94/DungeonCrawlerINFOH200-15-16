package com.gmail.julvdev.DungeonCrawler.view;

import com.gmail.julvdev.DungeonCrawler.model.interfaces.ViewInterface;

import javax.swing.*;
import java.awt.*;

/**
 * Created by julien on 10/03/16.
 * Frame containing a game
 */
public class GameFrame extends JFrame implements ViewInterface {

    private MapPanel mapPanel;
    private HUDPanel hudPanel;

    public GameFrame(String title) {
        super(title);

        this.setSize(new Dimension(800, 800));
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(this.getParent());

        hudPanel = new HUDPanel();
        mapPanel = new MapPanel();

        JPanel layout = new JPanel(new BorderLayout());
        layout.add(hudPanel, BorderLayout.NORTH);
        //layout.add(mapPanel, BorderLayout.CENTER);

        this.setContentPane(layout);
        this.setVisible(true);
    }

    @Override
    public void draw() {
        mapPanel.repaint();
        hudPanel.repaint();
    }
}
