package JavaAdvanced.ad06DefiningClasses.exercises.P07Google;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String personName;
    private Company company;
    private List<Pokemon> pokemon;
    private List<Parent> parent;
    private List<Child> child;
    private Car car;

    public Person(String personName) {
        this.personName = personName;
    }

    @Override
    public String toString() {
        return String.format("%s%n" +
                        "Company:%n" +
                        "%s" +
                        "Car:%n" +
                        "%s" +
                        "Pokemon:%n" +
                        "%s" +
                        "Parents:%n" +
                        "%s" +
                        "Children:%n" +
                        "%s"
                , this.personName
                , (this.company == null) ? "" : this.company + System.lineSeparator()
                , (this.car == null) ? "" : this.car + System.lineSeparator()
                , (this.pokemon == null) ? "" : this.pokemon.stream().map(Pokemon::toString).collect(Collectors.joining(System.lineSeparator())) + System.lineSeparator()
                , (this.parent == null) ? "" : this.parent.stream().map(Parent::toString).collect(Collectors.joining(System.lineSeparator())) + System.lineSeparator()
                , (this.child == null) ? "" : this.child.stream().map(Child::toString).collect(Collectors.joining(System.lineSeparator())) + System.lineSeparator());
    }

    public List<Pokemon> getPokemon() {
        if (this.pokemon == null) {
            this.pokemon = new ArrayList<>();
        }
        return this.pokemon;
    }

    public List<Parent> getParent() {
        if (this.parent == null) {
            this.parent = new ArrayList<>();
        }
        return this.parent;
    }

    public List<Child> getChild() {
        if (this.child == null) {
            this.child = new ArrayList<>();
        }
        return this.child;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
