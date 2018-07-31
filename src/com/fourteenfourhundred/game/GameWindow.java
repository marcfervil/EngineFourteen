package com.fourteenfourhundred.game;

import com.fourteenfourhundred.engine.Window;

public class GameWindow extends Window{



    public GameWindow() {
        super(new GameScreen(), "EngineFourteen Demo", 1280, 720);

    }

    public void startThreads(){
        super.startThreads();
    }


    public static void main(String args[]){
        new GameWindow();
    }



}
