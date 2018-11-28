package lesson3;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private HashMap<String, String> pb = new HashMap<>();

    public void add(String lastName, String telNumber) {
        this.pb.put(telNumber, lastName);
    }

    public void get(String lastName) {
        System.out.println("Телефонные номера " + lastName + ":");
        for (Map.Entry<String, String> o: this.pb.entrySet()) {
            if (o.getValue() == lastName) {
                System.out.println(o.getKey());
            }

        }
    }

}
