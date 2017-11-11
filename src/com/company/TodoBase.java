package com.company;

import java.util.Date;

public abstract class TodoBase{
    private String name;
    private Date completeData;

    protected TodoTypes type;

    protected TodoBase(){


        setName("name");
        setCompleteData(new Date());
    }



    public Date getCompleteData() {
        return completeData;
    }

    public void setCompleteData(Date completeData) {
        this.completeData = completeData;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;

    }

    @Override
    public String toString() {
        return getName() +" "+ getCompleteData();
    }

    @Override
    public boolean equals(Object obj) {
        TodoBase objToCompare=(TodoBase) obj;
        boolean nameIsEqual=objToCompare.getName().equals(getName());
        boolean dateIsEqual=objToCompare.getCompleteData().toString().equals(getCompleteData().toString());
        boolean typeIsEqual=type.equals(objToCompare.type);
        return nameIsEqual && dateIsEqual && typeIsEqual;


    }
}





