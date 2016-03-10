package com.gmail.julvdev.DungeonCrawler.view;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * Created by julien on 10/03/16.
 * Panel containing the map
 */
public class MapPanel extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            g.drawImage(ImageIO.read(new File("img/player.png")), 0, 0, 64, 64, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
        g.dispose();
    }
}
