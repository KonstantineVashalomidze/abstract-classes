package com.knostantine.models;

public abstract class Human {
    protected String name;
    protected double weight; // cm
    protected double height; // k


    public Human(String name, double weight, double height){
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public String getName(){
        return this.name;
    }


    public double getWeight(){
        return this.weight;
    }

    public double getHeight(){
        return this.height;
    }

    @Override
    public boolean equals(Object o){
        if (o instanceof Human){
            Human human = (Human) o;
            return this.name.equals(human.name)
                    && this.height == human.height
                    && this.weight == human.weight;
        } else {
            return false;
        }
    }

    @Override
    public String toString(){
        return "Human{" +
                "Name='" + this.name + "'/" +
                "Height='" + this.height + "'/" +
                "Weight='" + this.weight + "'";
    }


}
