package ru.grigoriev;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    private final Map<String, String> phoneBookByName;
    private final Map<String, String> phoneBookByNumber;

    public PhoneBook() {
        this.phoneBookByName = new TreeMap<>();
        this.phoneBookByNumber = new HashMap<>();
    }

    public int add(String name, String numberPhone) {
        if (!phoneBookByName.containsKey(name)) {
            phoneBookByName.put(name, numberPhone);
            phoneBookByNumber.put(numberPhone, name);
            return (phoneBookByName.size() + phoneBookByNumber.size()) / 2;
        }
        return 0;
    }

    public String findByNumber(String numberPhone) {
        return phoneBookByNumber.get(numberPhone);
    }

    public String findByName(String name) {
        return phoneBookByName.get(name);
    }

    public String printAllNames() {
        StringBuilder sb = new StringBuilder();
        String name;
        for (Map.Entry<String, String> entry : phoneBookByName.entrySet()) {
            name = entry.getKey();
            sb.append(name).append("\n");
            System.out.println(name);
        }
        return sb.toString();
    }
}
