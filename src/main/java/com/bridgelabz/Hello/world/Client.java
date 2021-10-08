package com.bridgelabz.Hello.world;

public class Client {
    private String fname;
    private int rollno;
    private boolean active;

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    @Override
    public String toString() {
        return "Client{" +
                "fname='" + fname + '\'' +
                ", rollno=" + rollno +
                ", active=" + active +
                '}';
    }
}
