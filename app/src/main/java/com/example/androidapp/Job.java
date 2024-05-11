package com.example.androidapp;

public class Job {
    private int id;
    private String Job;

    public Job(int id, String job) {
        this.id = id;
        Job = job;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJob() {
        return Job;
    }

    public void setJob(String job) {
        Job = job;
    }
}
