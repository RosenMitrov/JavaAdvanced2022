package JavaAdvanced.ad08Generics.lab.P01Jar;

public class Main {
    public static void main(String[] args) {
        Jar<Integer> integerJar = new Jar<>();

        integerJar.add(5);
        integerJar.add(6);

        System.out.println(integerJar.remove());
        System.out.println(integerJar.remove());
    }
}
