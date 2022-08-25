package JavaAdvanced.ad03SetAndMap.lab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

//created by R.M.
public class P06ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Double>> shopsAndProducts = new TreeMap<>();

        String input = scanner.nextLine();

        while (!input.equals("Revision")) {
            String[] data = input.split(", ");
            String storeName = data[0];
            String productName = data[1];
            double price = Double.parseDouble(data[2]);

            shopsAndProducts.putIfAbsent(storeName, new LinkedHashMap<>());
            shopsAndProducts.get(storeName).put(productName, price);
            input = scanner.nextLine();
        }


        for (Map.Entry<String, Map<String, Double>> entryStore : shopsAndProducts.entrySet()) {
            System.out.printf("%s->%n", entryStore.getKey());
            for (Map.Entry<String, Double> entryProduct : entryStore.getValue().entrySet()) {
                System.out.printf("Product: %s, Price: %.1f%n", entryProduct.getKey(), entryProduct.getValue());
            }
        }
    }
}
/*
6.	Product Shop
Write a program that prints information about food shops in Sofia and the products they store.
Until the "Revision" command you will receive an input in the format: "{shop}, {product}, {price}".
Keep in mind that if you get a store that already exists, you need to gather product information in it.
Your output must be ordered by shop name and must be in the format:
"{shop}->
Product: {product}, Price: {price}"
The price should be formated to one digit after the decimal point.

 */