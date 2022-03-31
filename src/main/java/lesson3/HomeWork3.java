package lesson3;

import java.util.*;

public class HomeWork3 {
    public static void main(String[] args) {
        String[] arr = new String[]{"мама", "папа", "дочь", "сын", "дядя", "тетя", "сын", "дом", "диван",
                "диван", "шкаф", "стол", "стул", "мама", "пол", "потолок", "дверь", "дверь", "стена", "окно"};
        Set<String> mySet = new HashSet<>();
        Collections.addAll(mySet, arr);
        System.out.println(mySet);

        List<String> list = Arrays.asList(arr);
        for (String set : mySet) {
            int count = 0;
            for (String listElements : list) {
                if (Objects.equals(set, listElements)) {
                    count++;
                }
            }
            System.out.println(set + " встречается " + count + " раз");
        }


        Phonebook phonebook = new Phonebook();
        phonebook.add("89106543856", "Sidorov");
        phonebook.add("89037543844", "Sidorov");
        phonebook.add("89065854384", "Ivanov");

        System.out.println(phonebook.get("Sidorov"));
        System.out.println(phonebook.get("Ivano"));
    }
}
