package com.allengarvey.sandbox;

public class Button {
    Runnable clickHandler;

    public Runnable getClickHandler() {
        return clickHandler;
    }

    public void setClickHandler(Runnable clickHandler) {
        this.clickHandler = clickHandler;
    }

    public void click() {
        clickHandler.run();
    }
}
