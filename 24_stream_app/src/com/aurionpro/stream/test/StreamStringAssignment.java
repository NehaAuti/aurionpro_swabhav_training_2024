package com.aurionpro.stream.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamStringAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> names = Arrays.asList("Neha", "Sayali", "Sakshi", "Namrata", "Aagya");
        
         // 1. First 3 students sorted in ascending order
        List<String> firstThreeSorted = names.stream()
                                             .sorted()
                                             .limit(3)
                                             .collect(Collectors.toList());
        System.out.println("First 3 students sorted in Ascending Order: " + firstThreeSorted);

        // 2. First 3 students sorted in ascending order if it contains 'a'
        List<String> firstThreeWithA = names.stream()
                                            .filter(name -> name.toLowerCase().contains("a"))
                                            .sorted()
                                            .limit(3)
                                            .collect(Collectors.toList());
        System.out.println("First 3 students sorted in Ascending Order if it contains 'a': " + firstThreeWithA);

        // 3. Students in descending order
        List<String> studentsDescending = names.stream()
                                               .sorted(Comparator.reverseOrder())
                                               .collect(Collectors.toList());
        System.out.println("Students in Descending Order: " + studentsDescending);

        // 4. First 3 Characters of all names
        List<String> firstThreeCharacters = names.stream()
                                                 .map(name -> name.substring(0, 3))
                                                 .collect(Collectors.toList());
        System.out.println("First 3 characters of all names: " + firstThreeCharacters);

        // 5. Names of the students that contain less than or equal to 4 characters
        List<String> namesLessThanOrEqualTo4Characters = names.stream()
                                                              .filter(name -> name.length() <= 4)
                                                              .collect(Collectors.toList());
        System.out.println("Names of the students that contain less than or equal to 4 characters: " + namesLessThanOrEqualTo4Characters);
    }
}