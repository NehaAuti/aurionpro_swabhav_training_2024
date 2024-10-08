package com.aurionpro.structural.proxy.test;

import com.aurionpro.structural.proxy.model.ProxyWebsite;
import com.aurionpro.structural.proxy.model.Website;

public class ProxyPatternTest {

	public static void main(String[] args) {
		    Website website1 = new ProxyWebsite("http://example.com/admin", "admin");
	        Website website2 = new ProxyWebsite("http://example.com/user", "user");

	        // Admin user trying to access admin site
	        website1.access("admin");
	        System.out.println("");

	        // Regular user trying to access admin site
	        website1.access("user");
	        System.out.println("");

	        // Regular user trying to access regular site
	        website2.access("user");
	        System.out.println("");
	    }
	}