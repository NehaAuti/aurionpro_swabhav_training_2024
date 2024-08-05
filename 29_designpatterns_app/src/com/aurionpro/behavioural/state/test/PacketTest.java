package com.aurionpro.behavioural.state.test;

import com.aurionpro.behavioural.state.model.Packet;

public class PacketTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Packet packet = new Packet();
		        
		        // Initial State
		        System.out.println("Initial State:");
		        packet.printCurrentStatus();
		        System.out.println();
		        
		        // Transition to Shipped
		        System.out.println("Transition to Shipped:");
		        packet.goToNextState();
		        packet.printCurrentStatus();
		        System.out.println();
		        
		        // Transition to Received
		        System.out.println("Transition to Received:");
		        packet.goToNextState();
		        packet.printCurrentStatus();
		        System.out.println();
		        
		        // Transition to Delivered
		        System.out.println("Transition to Delivered:");
		        packet.goToNextState();
		        packet.printCurrentStatus();
		        System.out.println();
		        
		        // Attempt to transition to next state from Delivered
		        System.out.println("Attempt to transition to next state from Delivered:");
		        packet.goToNextState();
		        packet.printCurrentStatus();
		        System.out.println();
		        
		        // Transition back to Received
		        System.out.println("Transition back to Received:");
		        packet.goToPreviousState();
		        packet.printCurrentStatus();
		        System.out.println();
		        
		        // Transition back to Shipped
		        System.out.println("Transition back to Shipped:");
		        packet.goToPreviousState();
		        packet.printCurrentStatus();
		        System.out.println();
		        
		        // Transition back to Ordered
		        System.out.println("Transition back to Ordered:");
		        packet.goToPreviousState();
		        packet.printCurrentStatus();
		        System.out.println();
		        
		        // Attempt to transition to previous state from Ordered
		        System.out.println("Attempt to transition to previous state from Ordered:");
		        packet.goToPreviousState();
		        packet.printCurrentStatus();
		        System.out.println();
		        
		        // Transition to Shipped again
		        System.out.println("Transition to Shipped again:");
		        packet.goToNextState();
		        packet.printCurrentStatus();
		        System.out.println();
		        
		        // Transition to Received again
		        System.out.println("Transition to Received again:");
		        packet.goToNextState();
		        packet.printCurrentStatus();
		        System.out.println();
		        
		        // Transition to Delivered again
		        System.out.println("Transition to Delivered again:");
		        packet.goToNextState();
		        packet.printCurrentStatus();
		    }
		}