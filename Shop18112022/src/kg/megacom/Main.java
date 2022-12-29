package kg.megacom;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {



    List<Integer> integers = new ArrayList<>(Arrays.asList(1,23,4,5,62,15));
    Stream<Integer> stream = integers.stream().map(c->c*2);

    }
}