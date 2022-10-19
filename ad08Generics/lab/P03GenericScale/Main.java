package JavaAdvanced.ad08Generics.lab.P03GenericScale;

public class Main {
    public static void main(String[] args) {
        Scale<Integer> integerScale = new Scale<>(1,5);
        System.out.println(integerScale.getHeavier());
        Scale<Character> characterScale = new Scale<>('A','B');
        System.out.println(characterScale.getHeavier());
    }
}
