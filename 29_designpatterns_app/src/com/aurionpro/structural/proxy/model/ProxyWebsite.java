package com.aurionpro.structural.proxy.model;

public class ProxyWebsite implements Website {
    private RealWebsite realWebsite;
    private String url;
    private String userRole;

    public ProxyWebsite(String url, String userRole) {
        this.url = url;
        this.userRole = userRole;
    }

    @Override
    public void access(String userRole) {
        if (realWebsite == null) {
            realWebsite = new RealWebsite(url);
        }
        if (hasAccess(userRole)) {
            realWebsite.access(userRole);
        } else {
            System.out.println("Access denied for " + userRole + " to " + url);
        }
    }

    private boolean hasAccess(String userRole) {
        // Only allow access for admin users in this example
        return "admin".equalsIgnoreCase(userRole);
    }
}
