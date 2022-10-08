package com.example.garbagelist;

public class User {
    String garbageBin;
    String garbageStatus;
    String garbageLvl;

    public User(String garbageBin, String garbageStatus, String garbageLvl) {
        this.garbageBin = garbageBin;
        this.garbageStatus = garbageStatus;
        this.garbageLvl = garbageLvl;
    }

    public String getGarbageBin() {
        return garbageBin;
    }

    public String getGarbageStatus() {
        return garbageStatus;
    }

    public String getGarbageLvl() {
        return garbageLvl;
    }
}

