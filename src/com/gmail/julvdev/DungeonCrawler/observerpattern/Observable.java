package com.gmail.julvdev.DungeonCrawler.observerpattern;

/**
 * Created by julien on 14/03/16.
 * Observable interface
 */
public interface Observable {
    void addObserver(Observer obs);
    void removeObserver();
    void notifyObserver(String str);
}
