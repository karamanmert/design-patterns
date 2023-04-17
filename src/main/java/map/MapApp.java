package map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

/**
 * @author karamanmert
 */
public class MapApp {
    public static void main(String[] args) {
        Map<String, Person> stringMap = new HashMap<>();

        var person1 = new Person("Mert", "Karaman", 28);
        var person2 = new Person("Yiğit", "Karaman", 35);
        var person3 = new Person("Hasan", "Karaman", 55);

        stringMap.put(person1.getName(), person1);
        stringMap.put(person2.getName(), person2);
        stringMap.put(person3.getName(), person3);

        stringMap.forEach((key, value) -> System.out.println(key + " " + value.getSurname() + " " + value.getAge()));

        List<Person> personList = List.of(person1, person2, person3);

        Map<String, List<Person>> personMap = new HashMap<>();
        personList.forEach(person -> personMap.put(person.getName(), personList));

        System.out.println(personMap);

        Map<String, Person> collect = personList.stream().collect(toMap(Person::getName, person -> person));



    }
}

class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }
}