import java.util.*;


public class Main {
    public static void main(String[] args) {
        Map<String, Cat> catMap = new TreeMap<>(); // сортировка

        catMap.put("Барсик", new Cat("Барсик", "рыжий", 3));
        catMap.put("Мурзик", new Cat("Мурзик", "черный", 5));
        catMap.put("Рыжик", new Cat("Рыжик", "рыжий", 2));
        catMap.put("Леопольд", new Cat("Леопольд", "полосатый", 4));
        catMap.put("Том", new Cat("Том", "серый", 2));
        catMap.put("Кузя", new Cat("Кузя", "черный", 3));
        catMap.put("Базилио", new Cat("Базилио", "рыжий", 1));
        catMap.put("Васька", new Cat("Васька", "серый", 4));
        catMap.put("Матроскин", new Cat("Матроскин", "белый", 6));
        catMap.put("Тест", new Cat("Тест" ));//Проверка если пустой

        System.out.println("\nСписок котов в алфавитном порядке:");
        for (String name : catMap.keySet()) {
            System.out.println(name + " - " + catMap.get(name).getColor());

        }

        List<Cat> sortedByAge = new ArrayList<>(catMap.values());
        sortedByAge.sort(Comparator.comparingInt(Cat::getAge));

        System.out.println("\nСписок котов, отсортированный по возрасту:");
        for (Cat cat : sortedByAge) {
            System.out.println(cat.getName() + " - " + cat.getColor() + " - " + cat.getAge());
        }
        System.out.println("Количество котов: " + Cat.getAllCatsCount());
    }
}