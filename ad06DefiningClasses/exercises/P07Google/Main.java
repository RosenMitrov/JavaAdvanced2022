package JavaAdvanced.ad06DefiningClasses.exercises.P07Google;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        Map<String, Person> peopleMap = new HashMap<>();

        while (!input.equals("End")) {
            String[] data = input.split("\\s+");
            String personName = data[0];
            String command = data[1];

            peopleMap.putIfAbsent(personName, new Person(personName));
            Person person = peopleMap.get(personName);

            switch (command) {
                case "company":
                    String companyName = data[2];
                    String companyDepartment = data[3];
                    double companySalary = Double.parseDouble(data[4]);
                    Company company = new Company(companyName, companyDepartment, companySalary);
                    person.setCompany(company);
                    break;
                case "pokemon":
                    String pokemonName = data[2];
                    String pokemonType = data[3];
                    Pokemon pokemon = new Pokemon(pokemonName, pokemonType);
                    person.getPokemon().add(pokemon);
                    break;
                case "parents":
                    String parentName = data[2];
                    String parentBirthday = data[3];
                    Parent parent = new Parent(parentName, parentBirthday);
                    person.getParent().add(parent);
                    break;
                case "children":
                    String childName = data[2];
                    String childBirthday = data[3];
                    Child child = new Child(childName, childBirthday);
                    person.getChild().add(child);
                    break;
                case "car":
                    String carModel = data[2];
                    int carSpeed = Integer.parseInt(data[3]);
                    Car car = new Car(carModel, carSpeed);
                    person.setCar(car);
                    break;
            }
            input = scanner.nextLine();
        }

        String personToPrint = scanner.nextLine();

        Person person = peopleMap.get(personToPrint);

        System.out.println(person);
    }
}
