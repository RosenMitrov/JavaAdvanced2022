package JavaAdvanced.ad06DefiningClasses.exercises.P06PokemonTrainer;

public class Pokemon {
    private String namePokemon;
    private String elementPokemon;
    private int healthPokemon;

    public Pokemon(String namePokemon, String elementPokemon, int healthPokemon) {
        this.namePokemon = namePokemon;
        this.elementPokemon = elementPokemon;
        this.healthPokemon = healthPokemon;
    }

    public void looseHealth() {
        this.healthPokemon -= 10;
    }

    public boolean isDead() {
        return this.healthPokemon <= 0;
    }

    public String getElementPokemon() {
        return this.elementPokemon;
    }

}
