package JavaAdvanced.ad06DefiningClasses.exercises.P06PokemonTrainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {

    private String nameTrainer;
    private int countBadgesTrainer;
    private List<Pokemon> pokemonList;

    public Trainer(String nameTrainer) {
        this.nameTrainer = nameTrainer;
        this.countBadgesTrainer = 0;
        this.pokemonList = new ArrayList<>();
    }

    public boolean hasElement(String element) {
        return this.pokemonList.stream().anyMatch(pokemon -> pokemon.getElementPokemon().equals(element));
    }

    public void applyCommand(String element) {
        if (hasElement(element)) {
            this.countBadgesTrainer++;
        } else {
            this.pokemonList.forEach(Pokemon::looseHealth);
            this.pokemonList.removeIf(Pokemon::isDead);
        }
    }

    @Override
    public String toString() {
        return this.nameTrainer + " " + this.countBadgesTrainer + " " + this.pokemonList.size();
    }

    public List<Pokemon> getPokemonList() {
        return this.pokemonList;
    }

    public int getCountBadgesTrainer() {
        return this.countBadgesTrainer;
    }
}
