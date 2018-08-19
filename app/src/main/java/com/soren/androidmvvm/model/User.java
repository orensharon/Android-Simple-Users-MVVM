package com.soren.androidmvvm.model;

public class User {

    private int id;
    private String name;
    private boolean activated;
    private String photoUrl;

    public User(int id, String name, boolean activated, String photoUrl) {
        this.id = id;
        this.name = name;
        this.activated = activated;
        this.photoUrl = photoUrl;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isActivated() {
        return activated;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }
}
