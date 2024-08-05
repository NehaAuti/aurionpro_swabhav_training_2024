package com.aurionpro.stream.model;

public class Country {
    private String code;
    private String name;
    private int regionId;

    public Country(String code, String name, int regionId) {
        this.code = code;
        this.name = name;
        this.regionId = regionId;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getRegionId() {
        return regionId;
    }

    @Override
    public String toString() {
        return name + " (" + code + ")";
    }
}
