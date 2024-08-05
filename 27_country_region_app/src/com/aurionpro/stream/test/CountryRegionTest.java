package com.aurionpro.stream.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Scanner;

import com.aurionpro.stream.model.Country;
import com.aurionpro.stream.model.Region;

public class CountryRegionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Region> regions = Arrays.asList(
                new Region(1, "Europe"),
                new Region(2, "Americas"),
                new Region(3, "Asia"),
                new Region(4, "Middle East and Africa")
            );

            List<Country> countries = Arrays.asList(
                new Country("IT", "Italy", 1),
                new Country("JP", "Japan", 3),
                new Country("US", "United States of America", 2),
                new Country("CA", "Canada", 2),
                new Country("CN", "China", 3),
                new Country("IN", "India", 3),
                new Country("AU", "Australia", 3),
                new Country("ZW", "Zimbabwe", 4),
                new Country("SG", "Singapore", 3),
                new Country("UK", "United Kingdom", 1),
                new Country("FR", "France", 1),
                new Country("DE", "Germany", 1),
                new Country("ZM", "Zambia", 4),
                new Country("EG", "Egypt", 4),
                new Country("BR", "Brazil", 2),
                new Country("CH", "Switzerland", 1),
                new Country("NL", "Netherlands", 1),
                new Country("MX", "Mexico", 2),
                new Country("KW", "Kuwait", 4),
                new Country("IL", "Israel", 4),
                new Country("DK", "Denmark", 1),
                new Country("HK", "HongKong", 3),
                new Country("NG", "Nigeria", 4),
                new Country("AR", "Argentina", 2),
                new Country("BE", "Belgium", 1)
            );
            // Create a map of region IDs to Region objects
            Map<Integer, Region> regionIdMap = regions.stream()
                                                      .collect(Collectors.toMap(region -> region.getId(), Function.identity()));

            Scanner scanner = new Scanner(System.in);

            // Get country name by code
            System.out.print("Enter country code to get the name: ");
            String code = scanner.nextLine();
            String countryName = getCountryNameByCode(countries, code);
            System.out.println("Country name: " + countryName);

            // Get countries by region ID
            System.out.print("Enter region ID to get countries: ");
            int regionId = scanner.nextInt();
            List<Country> countriesInRegion = getCountriesByRegionId(countries, regionId);
            System.out.println("Countries in region ID " + regionId + ":");
            countriesInRegion.stream()
                              .forEach(country -> System.out.println(country.toString()));

            // Count of countries in each region
            Map<Integer, Long> countryCountByRegionId = countries.stream()
                .collect(Collectors.groupingBy(Country::getRegionId, Collectors.counting()));
            System.out.println("Count of countries in each region:");
            countryCountByRegionId.forEach((regionIdKey, count) -> 
                System.out.println("Region ID " + regionIdKey + ": " + count)
            );

            scanner.close();
        }

        // Method to get country name by code
        public static String getCountryNameByCode(List<Country> countries, String code) {
            return countries.stream()
                            .filter(country -> country.getCode().equals(code))
                            .map(country -> country.getName()) 
                            .findFirst()
                            .orElse("Country code not found");
        }

        // Method to get all countries in a region by region ID
        public static List<Country> getCountriesByRegionId(List<Country> countries, int regionId) {
            return countries.stream()
                            .filter(country -> country.getRegionId() == regionId)
                            .collect(Collectors.toList());
        }
    }