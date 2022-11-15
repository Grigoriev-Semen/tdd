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
            return (phoneBookByName.size() + phoneBookByNumber.size())/2;
        }
        return 0;
    }
}
