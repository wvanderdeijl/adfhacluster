package com.redheap.hacluster;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

public class MyDataControl {

    private List<Employee> simpleList;
    private List<Employee> paramList;

    public MyDataControl() {
    }

    public List<Employee> getEmployees() {
        if (simpleList == null) {
            System.out.println("getEmployees creating a new/initial list");
            simpleList = new ArrayList<Employee>(10);
            for (int i = 1; i <= 10; i++) {
                simpleList.add(new Employee(i, "employee" + i));
            }
        }
        System.out.println("getEmployees returning its list");
        return simpleList;
    }

    /**
     * Method simulating a web service call or some other business service.
     * Typically requires parameters.
     */
    public List<Employee> fetchEmployees(String prefix) {
        System.out.println("fetchEmployees building list to simulate business service call");
        paramList = new ArrayList<Employee>(10);
        for (int i = 1; i <= 10; i++) {
            paramList.add(new Employee(i, prefix + "-employee" + i));
        }
        System.out.println("fetchEmployees returning its list");
        return paramList;
    }

    public Serializable createSnapshot() {
        System.out.println("** createSnapshot");
        List state = new ArrayList(2);
        state.add(simpleList);
        state.add(paramList);
        return (Serializable) state;
    }

    public void restoreSnapshot(Serializable handle) {
        System.out.println("** restoreSnapshot " + handle);
    }

    public void removeSnapshot(Serializable handle) {
        System.out.println("** removeSnapshot " + handle);
    }
}
