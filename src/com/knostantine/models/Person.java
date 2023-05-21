package com.knostantine.models;

public class Person extends Human {

    private String pid;

    public Person(String name, double weight, double height, String pid){
        super(name, weight, height);
        this.pid = pid;
    }

    public String getPid(){
        return this.pid;
    }

    @Override
    public boolean equals(Object o){
        if (o instanceof Person) {
            Person person = (Person) o;
            return this.pid.equals(person.pid)
                    && super.equals(person);


        } else {
            return false;
        }
    }


    @Override
    public String toString(){

        return super.toString() + "/PID=" + this.pid + "'}";


    }


}
