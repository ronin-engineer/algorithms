package array;

import java.util.*;
import java.util.stream.Collectors;

public class DisplayTable {
    // medium
    // https://leetcode.com/problems/display-table-of-food-orders-in-a-restaurant/
    public static List<List<String>> displayTable(List<List<String>> orders) {
        HashMap<String, HashMap<String, Integer>> tableMap = new HashMap<>();
        Set<Integer> tables = new HashSet<>();
        Set<String> foods = new HashSet<>();

        for (List<String> order : orders) {
            String tableId = order.get(1);
            tables.add(Integer.valueOf(tableId));
            HashMap<String, Integer> tableInfo = tableMap.get(tableId);
            if (tableInfo == null) {
                tableInfo = new HashMap<>();
                tableMap.put(tableId, tableInfo);
            }

            String food = order.get(2);
            foods.add(food);
            Integer num = tableInfo.computeIfAbsent(food, key -> 0);
            tableInfo.put(food, ++num);
        }


        List<Integer> sortedTables = tables.stream().sorted().collect(Collectors.toList());
        List<String> sortedFoods = foods.stream().sorted().collect(Collectors.toList());

        List<String> firstRow = new LinkedList<>();
        firstRow.add("Table");
        firstRow.addAll(sortedFoods);

        List<List<String>> result = new LinkedList<>();
        result.add(firstRow);
        for (Integer table: sortedTables) {
            List<String> orderInfo = new LinkedList<>();

            String tableId = String.valueOf(table);
            orderInfo.add(tableId);
            HashMap<String, Integer> tableInfo = tableMap.get(tableId);
            for (String food: sortedFoods) {
                Integer num = tableInfo.getOrDefault(food, 0);
                orderInfo.add(String.valueOf(num));
            }

            result.add(orderInfo);
        }

        return result;
    }

    public static void main(String[] args) {
        List<List<String>> input = new LinkedList<>();
        input.add(Arrays.asList("David","3","Ceviche"));
        input.add(Arrays.asList("Corina","10","Beef Burrito"));
        input.add(Arrays.asList("David","3","Fried Chicken"));
        input.add(Arrays.asList("Carla","5","Water"));
        input.add(Arrays.asList("Carla","5","Ceviche"));
        input.add(Arrays.asList("Rous","3","Ceviche"));
        List<List<String>> output = displayTable(input);
        System.out.println(output);
    }
}
