import java.util.*;
import java.util.stream.Collectors;

public class ExampleCollections {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            integerList.add(i);
        }

        integerList.removeIf(number -> number % 2 == 1);
        for (Integer integer : integerList) {
            System.out.println(integer);
        }

        System.out.println("\n");

        Set<String> stringSet = new HashSet<>();
        stringSet.add("Raul");
        stringSet.add("Raul");
        stringSet.add("Raul");

        stringSet.forEach(System.out::println);

        System.out.println("\n");

        Map<String, Integer> map = new HashMap<>();
        map.put("Car1", 10);
        map.put("Car2", 5);
        map.put("Car3", 7);
        map.put("Car4", 15);
        map.put("Car5", 20);

        System.out.println("\nValue");
        for (Integer value : map.values()) {
            if (value > 10) {
                System.out.println(value);
            }
        }

        System.out.println("\n");

        List<Integer> integerList2 = new ArrayList<>();
        integerList2.add(7);
        integerList2.add(4);
        integerList2.add(5);
        integerList2.add(2);
        integerList2.add(1);
        integerList2.add(2);
        integerList2.add(4);
        integerList2.add(1);

        System.out.println("Eliminate all duplicates:");

        integerList2 = integerList2.stream().distinct().collect(Collectors.toList());

        System.out.println(integerList2);

        System.out.println("\n");

        System.out.println("Sort from high to low:");

        integerList2.sort(Collections.reverseOrder());

        System.out.println(integerList2);

        System.out.println("\n");

        System.out.println("Set of Strings from sorted list");

        Set<String> list2Set = new HashSet<>(Collections.singleton(integerList2.toString()));

        System.out.println(list2Set);

        System.out.println("\n");

        System.out.println("Map having keySet as Strings from previous Set and the values as Integers from previous list");

        Map<Set<String>, List<Integer>> stringIntegerMap = new HashMap<>();

        stringIntegerMap.put(list2Set, integerList2);

        System.out.println(stringIntegerMap);
    }
}
