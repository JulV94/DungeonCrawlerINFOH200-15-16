package com.gmail.julvdev.DungeonCrawler.observerpattern;

/**
 * Created by julien on 14/03/16.
 * Observer interface
 */
public interface Observer {
    void update(String str, Update target);
}
