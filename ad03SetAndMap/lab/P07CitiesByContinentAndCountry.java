package JavaAdvanced.ad03SetAndMap.lab;

import java.util.*;

//created by R.M.
public class P07CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, List<String>>> continentsAndCountries = new LinkedHashMap<>();

        int countCommands = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < countCommands; i++) {
            String[] data = scanner.nextLine().split(" ");
            String continent = data[0];
            String country = data[1];
            String city = data[2];

            continentsAndCountries.putIfAbsent(continent, new LinkedHashMap<>());
            continentsAndCountries.get(continent).putIfAbsent(country, new ArrayList<>());
            continentsAndCountries.get(continent).get(country).add(city);
        }

        for (Map.Entry<String, Map<String, List<String>>> continentEntry : continentsAndCountries.entrySet()) {
            System.out.printf("%s:%n", continentEntry.getKey());

            for (Map.Entry<String, List<String>> countryEntry : continentEntry.getValue().entrySet()) {
                System.out.printf("  %s -> %s%n", countryEntry.getKey(), String.join(", ", countryEntry.getValue()));
            }
        }


    }
}
/*
7.	Cities by Continent and Country
Write a program to read continents, countries, and their cities put them on a nested map, and print them in the order of their first appearance.

 */