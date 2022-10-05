package JavaAdvanced.ad06DefiningClasses.exercises.P06PokemonTrainer;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Trainer> trainerMap = new LinkedHashMap<>();

        while (!input.equals("Tournament")) {
            String[] tokens = input.split("\\s+");
            String nameTrainer = tokens[0];
            String namePokemon = tokens[1];
            String elementPokemon = tokens[2];
            int healthPokemon = Integer.parseInt(tokens[3]);

            Pokemon pokemon = new Pokemon(namePokemon, elementPokemon, healthPokemon);

            Trainer trainer;
            if (trainerMap.containsKey(nameTrainer)) {
                trainer = trainerMap.get(nameTrainer);
            } else {
                trainer = new Trainer(nameTrainer);
                trainerMap.put(nameTrainer, trainer);
            }
            trainer.getPokemonList().add(pokemon);
            input = scanner.nextLine();

        }

        input = scanner.nextLine();
        while (!input.equals("End")) {
            String finalElement = input;
            trainerMap.values().forEach(trainer -> trainer.applyCommand(finalElement));
            input = scanner.nextLine();
        }

        trainerMap.values().stream().sorted(Comparator.comparing(Trainer::getCountBadgesTrainer).reversed()).forEach(System.out::println);
    }
}
