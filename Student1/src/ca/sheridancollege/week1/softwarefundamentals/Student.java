/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 *
 * @author Sergio
 */
public class Student1 {
    
    private String name12;
    private int ID;

    private int nuMCourses;

    /**
     * Get the value of nuMCourses
     *
     * @return the value of nuMCourses
     */
    public int getNuMCourses() {
        return nuMCourses;
    }

    /**
     * Set the value of nuMCourses
     *
     * @param nuMCourses new value of nuMCourses
     */
    public void setNuMCourses(int nuMCourses) {
        this.nuMCourses = nuMCourses;
    }

    public Student1(String name, int ID) {
        this.name12 = name;
        this.ID = ID;
    }

    public String getName() {
        return name12;
    }

    public void setName(String name) {
        this.name12 = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    
}
