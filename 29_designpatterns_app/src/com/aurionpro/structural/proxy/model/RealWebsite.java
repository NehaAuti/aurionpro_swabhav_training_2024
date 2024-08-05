package com.aurionpro.structural.proxy.model;

public class RealWebsite implements Website {
    private String url;

    public RealWebsite(String url) {
        this.url = url;
    }

    @Override
    public void access(String userRole) {
        System.out.println(userRole + " accessing " + url);
    }
}
