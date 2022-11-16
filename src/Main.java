import com.sun.jdi.Value;

import java.security.Key;
import java.util.*;

public class Main {

    static HashMap<String, Integer> childParty = new HashMap<>();

    static Map<String, Integer> newMap = new HashMap<>();

    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Скарлетт О'Хара", "89267778787");
        phoneBook.put("Ретт Батлер", "89269875656");
        phoneBook.put("Эшли Уилкс", "89269867556");
        phoneBook.put("Мелани Гамильтон", "89268302756");
        phoneBook.put("Стюарт Тарлтон", "89262137693");
        phoneBook.put("Брент Тарлтон", "89269876543");
        phoneBook.put("Наташа Ростова", "89264659374");
        phoneBook.put("Пьер Безухов", "89266734927");
        phoneBook.put("Джон Росс", "89267694987");
        phoneBook.put("Джеймс Фицджеймс", "89268694658");
        phoneBook.put("Френсис Крозье", "89261237659");
        phoneBook.put("Томас Блэнки", "89260648392");
        phoneBook.put("Корнелиус Хикки", "89268602634");
        phoneBook.put("Гарри Гудсир", "89261234567");
        phoneBook.put("Джон Франклин", "89269876543");
        phoneBook.put("Кит Флик", "89261235689");
        phoneBook.put("Лили Хосина", "89260462197");
        phoneBook.put("Гилберт Росс", "89261238645");
        phoneBook.put("Брайан Брандон", "89268603701");

        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        //task3

        childParty.put("Снежинка", 4);
        childParty.put("Звездочка", 3);
        childParty.put("Бабочка", 2);
        childParty.put("Пират", 3);
        childParty.put("Динозавр", 1);

        System.out.println(childParty);

        addEntry("Бабочка", 7);

        System.out.println(childParty);

        //hw2 task1

        List<Integer> randomNumbers1 = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            randomNumbers1.add(random.nextInt(1001));
        }
        List<Integer> randomNumbers2 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            randomNumbers2.add(random.nextInt(1001));
        }
        List<Integer> randomNumbers3 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            randomNumbers3.add(random.nextInt(1001));
        }
        List<Integer> randomNumbers4 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            randomNumbers4.add(random.nextInt(1001));
        }
        List<Integer> randomNumbers5 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            randomNumbers5.add(random.nextInt(1001));
        }

        Map<String, List<Integer>> wonderfulMap = new LinkedHashMap<>();

        wonderfulMap.put("Список 1", randomNumbers1);
        wonderfulMap.put("Список 2", randomNumbers2);
        wonderfulMap.put("Список 3", randomNumbers3);
        wonderfulMap.put("Список 4", randomNumbers4);
        wonderfulMap.put("Список 5", randomNumbers5);

        makeNewMap(wonderfulMap);
        printNewMap();

        //hw2 task2

        Map<Integer, String> months = new LinkedHashMap<>();
        months.put(1, "January");
        months.put(2, "February");
        months.put(3, "March");
        months.put(4, "April");
        months.put(5, "May");
        months.put(6, "June");
        months.put(7, "July");
        months.put(8, "August");
        months.put(9, "September");
        months.put(10, "October");

        for (Map.Entry<Integer, String> integerStringEntry : months.entrySet()) {
            System.out.println(integerStringEntry.getKey() + ": " + integerStringEntry.getValue());
        }
    }

    public static void addEntry(String key, Integer value) {
        if (childParty.containsValue(value) && childParty.containsKey(key)) {
            throw new RuntimeException("Такой объект уже есть!");
        } else {
            childParty.put(key, value);
        }
    }

    public static void makeNewMap(Map<String, List<Integer>> initialMap) {
        for (Map.Entry<String, List<Integer>> entry: initialMap.entrySet()) {
            int sumValues = 0;
            for(Integer integer:entry.getValue()){
                sumValues += integer;
                newMap.put(entry.getKey(), sumValues);
            }
        }
    }
    public static void printNewMap(){
        for(Map.Entry<String, Integer> entry: newMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}


