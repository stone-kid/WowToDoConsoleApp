package com.company;

import java.util.Date;
import java.util.UUID;

public abstract class TodoBase implements Cloneable{
    private String name;
    private Date completeData;
    private String id;

    protected TodoTypes type;

    protected TodoBase(){


        setName("name");
        setCompleteData(new Date());
        id = (UUID.randomUUID().toString());

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

    public String getId() {
        return id;
    }
@Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}





