package lesson3;

import java.util.*;

public class Phonebook extends HashMap<String, String> {
    private Map<String, String> map = new HashMap<>();

    public void add(String number, String lastName) {
        this.map.put(number, lastName);
    }

    public List<String> get(String lastName) {
        List<String> listKey = new ArrayList<>();
        for (Entry<String, String> entry : map.entrySet()) {
            if (Objects.equals(entry.getValue(), lastName)) {
                listKey.add(entry.getKey());
            }
        }
        if (listKey.isEmpty()) {
            System.out.println("Не найдено совпадений по фамилии");
        }
        return listKey;
    }
}
