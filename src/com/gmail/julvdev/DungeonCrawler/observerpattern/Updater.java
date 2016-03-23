package com.gmail.julvdev.DungeonCrawler.observerpattern;

/**
 * Created by julien on 21/03/16.
 * Object that is used by the observable pattern
 */
public class Updater {

    private TargetType target;
    private String action;

    public Updater(TargetType target, String action) {
        this.target = target;
        this.action = action;
    }

    public TargetType getTarget() {
        return target;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void setTarget(TargetType target) {
        this.target = target;
    }
}
