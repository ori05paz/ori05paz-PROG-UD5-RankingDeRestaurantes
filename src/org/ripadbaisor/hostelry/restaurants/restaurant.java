package org.ripadbaisor.hostelry.restaurants;

public class Restaurant {

    private String name;
    private String location;
    private int schedule;
    private float score;

    public Restaurant(String name, String location, int schedule, float score) {
        this.name = name;
        this.location = location;
        this.schedule = schedule;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSchedule() {
        return schedule;
    }

    public void setSchedule(int schedule) {
        this.schedule = schedule;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    
}
