package com.company;

import java.time.Duration;
import java.time.Period;

public class MythicDungeonTodo extends TodoBase{
    private int mythicDificulty;
    private Duration time;
    private int chests;

    public MythicDungeonTodo(){
        setChests(0);
        setMythicDificulty(0);
        setTime(Duration.ofMinutes(10));
        type=TodoTypes.MythicDungeon;


    }


    public int getMythicDificulty() {
        return mythicDificulty;
    }

    public void setMythicDificulty(int mythicDificulty) {

        this.mythicDificulty = mythicDificulty;
    }

    public int getChests() {
        return chests;
    }

    public void setChests(int chests) {
        this.chests = chests;
    }

    public Duration getTime() {
        return time;
    }

    public void setTime(Duration time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return super.toString()+ " "+getMythicDificulty()+" "+getChests()+" "+getTime();
    }
}
