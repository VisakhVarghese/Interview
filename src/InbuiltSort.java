import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class InbuiltSort {
    public static void main(String[] args) {
        int[] arr = {5,3,8,1,9,2};

        Integer[] objectArray = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        String[] str = Arrays.stream(arr).mapToObj(String::valueOf).toArray(String[]::new);

        String[] str2 = Arrays.stream(objectArray).map(String::valueOf).toArray(String[]::new);

        Integer[] integers = Arrays.stream(str).map(Integer::valueOf).toArray(Integer[]::new);

        int[] revert =  Arrays.stream(str).mapToInt(Integer::parseInt).toArray();

        System.out.println(Arrays.toString(str));

        Arrays.sort(objectArray, Collections.reverseOrder());
        arr = Arrays.stream(objectArray).mapToInt(Integer::intValue).toArray();

        Integer[] array = {6,7,2,3,9,1,5};
        Arrays.sort(arr);

        Arrays.sort(array,Collections.reverseOrder());
    }
}
