import java.util.*;
import java.util.stream.Collectors;

public class CustomStream {
    public static void main(String[] args) {

    processHashStream();
    processListStream();

    }
    public static void processHashStream(){
        // Original map with potential duplicate keys
        Map<String, Integer> student1 = new HashMap<>();
        student1.put("Visakh", 60);
        student1.put("N", 60);
        student1.put("Aslam", 78);
        student1.put("Ni", 60); // This will overwrite the previous value for "Nikhina"
        student1.put("Sarin", 69);
        student1.put("Sarin", 79);
        student1.put("Ni", 59);// This will overwrite the previous value for "Sarin"

        // Collecting to a new map where only the first value for each key is retained
        Map<String, Integer> firstValueMap = student1.entrySet()
                .stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,            // Key mapper: keep the key
                        Map.Entry::getValue,          // Value mapper: keep the value
                        (existingValue, newValue) -> existingValue, // Merge function: retain the first value
                        TreeMap::new            // Use LinkedHashMap to maintain insertion order
                ));

        // Print the result
        System.out.println(firstValueMap);

        // To retain the first occurrence of each key
        Map<String, Integer> firstValueMap1 = new LinkedHashMap<>();
//        student1.forEach((key, value) -> {
//            // Only put the key if it's not already present in the firstValueMap
//            firstValueMap1.putIfAbsent(key, value);
//        });

        for (Map.Entry<String, Integer> entry : student1.entrySet()) {
            // Only add the entry if the key is not already present
            firstValueMap1.putIfAbsent(entry.getKey(), entry.getValue());
        }


        System.out.println(firstValueMap1);


        List<Order> orders = List.of(
                new Order("C1", 100),
                new Order("C2", 200),
                new Order("C1", 150),
                new Order("C3", 300),
                new Order("C2", 250)
        );

        // Collecting to map where only the first order amount for each customer is retained
        Map<String, Integer> firstOrderAmounts = orders.stream()
                .collect(Collectors.toMap(
                        Order::getCustomerId,         // Key mapper: customerID
                        Order::getOrderAmount,        // Value mapper: orderAmount
                        (existingValue, newValue) -> existingValue // Merge function: retain the first value
                ));

        // Print the result
        firstOrderAmounts.forEach((customerId, amount) ->
                System.out.println("Customer: " + customerId + ", First Order Amount: " + amount));
    }

    public static void processListStream(){
        List<Object> student1 = new ArrayList<>();
        student1.add("Visakh");
        student1.add("Nikhina");
        student1.add("Sarin");
        student1.add(100);

        List<Integer> intex = new ArrayList<>();
        boolean result = student1.stream().anyMatch(c -> c.equals("Nikhina"));
        for (int i=0; i<student1.size();i++){
            if(student1.get(i) instanceof String){
             intex.add(i);
            }
        }
        System.out.println(intex);
//        System.out.println(index);
    }

}


class Order {
    private final String customerId;
    private final int orderAmount;

    public Order(String customerId, int orderAmount) {
        this.customerId = customerId;
        this.orderAmount = orderAmount;
    }

    public String getCustomerId() {
        return customerId;
    }

    public int getOrderAmount() {
        return orderAmount;
    }
}
