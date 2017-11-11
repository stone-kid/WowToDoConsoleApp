package com.company;

public class RaidTodo extends TodoBase {
    private RaidDificulty dificulty;

    public RaidTodo(){
        super();
        type=TodoTypes.Raid;
        setDificulty(RaidDificulty.lfr);
    }

    public RaidDificulty getDificulty() {
        return dificulty;
    }

    public void setDificulty(RaidDificulty dificulty) {
        this.dificulty = dificulty;
    }

    @Override
    public String toString() {
        return super.toString()+" "+getDificulty();
    }
}

