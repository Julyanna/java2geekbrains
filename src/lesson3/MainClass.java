package lesson3;

import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------");
        System.out.println("Задание №1 - Массив с дублями слов: ");
        System.out.println("-------------------------------------------");
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Orange");
        arr.add("Apple");
        arr.add("Apple");
        arr.add("Lime");
        arr.add("Lime");
        arr.add("Onion");
        arr.add("Onion");
        arr.add("Meat");
        arr.add("Tomatoes");
        arr.add("Tomatoes");
        arr.add("Pumpkin");
        arr.add("Radish");
        arr.add("Cabbage");
        arr.add("Apple");
        arr.add("Nectarine");

        HashSet<String> uniqueElements = new LinkedHashSet<>(arr);
        System.out.println("Уникальные элементы списка: ");
        System.out.println(uniqueElements);

        HashMap<String, Integer> countWords = new HashMap<>();
        for (String word: arr) {
            if (!countWords.containsKey(word)) {
                countWords.put(word, 0);
            }
            countWords.put(word, countWords.get(word) + 1);
        }
        System.out.println("");
        System.out.println("Количество слов, встречающихся в коллекции:");
        for (Map.Entry<String, Integer> o: countWords.entrySet()) {
            System.out.print(o.getKey() + ": ");
            System.out.println(o.getValue());
        }

        System.out.println("-------------------------------------------");
        System.out.println("Задание №2 - Телефонный справочник");
        System.out.println("-------------------------------------------");
        PhoneBook phoneBookExample = new PhoneBook();
        phoneBookExample.add("Петров","8-906-715-81-00");
        phoneBookExample.add("Водкин","8-904-123-00-00");
        phoneBookExample.add("Нестеренко","8-998-333-33-22");
        phoneBookExample.add("Павленко","8-911-111-01-10");
        phoneBookExample.add("Петров","8-901-987-65-43");
        phoneBookExample.add("Петров","8-906-232-32-23");
        phoneBookExample.add("Нестеренко","8-998-888-88-88");

        phoneBookExample.get("Петров");
        phoneBookExample.get("Нестеренко");
        phoneBookExample.get("Водкин");
    }
}
