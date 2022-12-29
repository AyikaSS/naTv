import FuncInterface.Senior;
import StreamFilter.Employee;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static StreamFilter.Employee.Position.*;

public class Main {
    public static void main(String[] args) {


//        Stream<Integer> stream = integers.stream().map(c->c*2);
//        Long count = integers.stream().map(c->c*2).count();
           List<String> strings = new ArrayList<>(Arrays.asList("test","test2", "test3"));

        List<String> stringUpper = strings.stream().map(c->c.toUpperCase()).collect(Collectors.toList());
       System.out.println(strings);

        System.out.println(strings.stream().distinct().collect(Collectors.toList()));

       List<Integer> integers = new ArrayList<>(Arrays.asList(1,23,5,67,9));
       System.out.println(integers.stream().map(c->c+2).max(Comparator.comparing(Integer::intValue)));
       List<Employee> employees = new ArrayList<>(Arrays.asList(new Employee("Aidai", 1000, MIDDLE ),
       new Employee("Aikanysh",5000, JUNIOR),
       new Employee("Dastan", 9000, SENIOR)));

       Optional<Employee> employee = employees.stream().max(Comparator.comparing(Employee::getSalary));
       employee.orElse(new Employee());
       employee.orElseThrow(()-> new RuntimeException("Not nothing"));
       Map<String,List<Employee>> map = employees.stream().collect(Collectors.groupingBy(Employee::getName));
        System.out.println(map);
        System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::getPosition)));
       List<Employee> employeeList = employee.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
       employeeList.forEach(System.out::println);

       employees.stream().filter(c->c.getSalary()>1500).forEach(System.out::println);
}
}
