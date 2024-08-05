package com.aurienpro.test;
import com.aurienpro.model.Enum.Day;
public class EnumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Day today = Day.MONDAY;

        switch (today) {
            case MONDAY:
                System.out.println("Today is Monday! Start of the work week.");
                break;
            case TUESDAY:
                System.out.println("Today is Tuesday.");
                break;
            case WEDNESDAY:
                System.out.println("Today is Wednesday. Midweek already!");
                break;
            case THURSDAY:
                System.out.println("Today is Thursday.");
                break;
            case FRIDAY:
                System.out.println("Today is Friday! The weekend is near.");
                break;
            case SATURDAY:
                System.out.println("Today is Saturday. Enjoy your weekend!");
                break;
            case SUNDAY:
                System.out.println("Today is Sunday. Rest and recharge.");
                break;
            default:
                System.out.println("Invalid day.");
                break;
        }

	}

}
