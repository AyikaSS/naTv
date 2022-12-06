import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(1,3,5,7,9));

        integers.stream().map(c->c+2).max(Comparator.comparing());

            List<String> strings = new ArrayList<>(Arrays.asList("Test","Test2", "Test3"));

        List<String> stringUpper = strings.stream().map(c->c.toUpperCase()).collect(Collectors.toList());

//        System.out.println(strings);
    }
}
