package pdump.pthree;

import java.util.*;
import java.util.stream.Collectors;

public class PTwo {

    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<>();

        customerList.add(new Customer(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        customerList.add(new Customer(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        customerList.add(new Customer(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        customerList.add(new Customer(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        customerList.add(new Customer(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));

        customerList.stream().sorted((cust1, cust2) -> cust2.getAge() - cust1.getAge()).map(Customer::getName).forEach(System.out::println);

        Map<String, Long> collect = customerList.stream().collect(Collectors.groupingBy(Customer::getDepartment, Collectors.counting()));
        System.out.println(collect.entrySet());

        Optional<Double> first = customerList.stream().sorted(Comparator.comparingDouble(Customer::getSalary).reversed()).map(Customer::getSalary).skip(1).findFirst();
        System.out.println(first.get());
    }








/*1)  Get the names of all customers sorted by their age in descending order.
2) Group customers by department and count the number of employees in each department.
3) Find the second highest salary among all customers.*/



}
