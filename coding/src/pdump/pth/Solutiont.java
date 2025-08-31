package pdump.pth;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Solutiont {


    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("abc","xyz", 44));
        list.add(new Employee("abc","xyz", 46));
        list.add(new Employee("abcd","xyz", 46));
        Map<String, Employee> collect = list.stream().collect(Collectors.toMap(Employee::location, Function.identity(), (employee, employee2) -> employee.salary() < employee2.salary() ? employee2 : employee));
        System.out.println(collect);
    }


}
