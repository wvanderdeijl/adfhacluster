package com.redheap.hacluster;

import java.io.Serializable;


public class Employee implements Serializable {

    private int id;
    private String name;

    public Employee() {
    }

    public Employee(int id, String name) {
        System.out.println("- instantiating Employee " + id + ", " + name);
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("- setting name for Employee " + id + " to " + name);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee[" + id + "," + name + "]";
    }

}
