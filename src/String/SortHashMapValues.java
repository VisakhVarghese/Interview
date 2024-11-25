package String;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class SortHashMapValues {

    public Map<String, List<String>> hashMap;
    public SortHashMapValues(){
        hashMap = new HashMap<>();
        hashMap.put("Fruits",Arrays.asList("Carrot", "Potato", "Tomato") );
        hashMap.put("Vegetables", Arrays.asList("Carrot", "Potato", "Tomato"));
        hashMap.put("Berries", Arrays.asList("Strawberry", "Blueberry", "Raspberry"));
    }

    public Map<String, String> flattenMap() {
        return hashMap.entrySet().stream()
                .flatMap(e->e.getValue()
                        .stream().peek(System.out::println)
                        .map(value -> new AbstractMap.SimpleEntry<>(e.getKey(), value)))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getKey,
                        (existing, replacement) -> existing + ", " + replacement));
    }
    public static void main(String[] args) {
        Map<String, Integer> inputs = new HashMap<>();

        inputs.put("a",11);
        inputs.put("w",9);
        inputs.put("c",7);
        inputs.put("d",5);
        inputs.put("b",4);
        inputs.put("n",1);

        Map<String, Integer> result = inputs.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1,e2)-> e1,
                        LinkedHashMap::new
                ));

      inputs.keySet().stream()
                .map(String::toUpperCase)
              .forEach(System.out::println);


        inputs.entrySet()
                        .forEach(System.out::println);

        SortHashMapValues example = new SortHashMapValues();
        Map<String, String> flattenedMap =  example.flattenMap();
        System.out.println(flattenedMap);

        List<Integer> result2 = inputs.values().stream().sorted().collect(Collectors.toList());
        List<String> result3 = inputs.keySet().stream().sorted().collect(Collectors.toList());

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);

        inputs.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(e->System.out.println((e.getValue())));

        for(int v : result2){
            for(String k : inputs.keySet()){
                if(inputs.get(k).equals(v)){
                    System.out.println("Key > "+ k + " Value > "+v);
                }
            }
        }

    }

}
