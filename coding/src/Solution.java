/*
import java.util.Comparator;

public class Solution {

    //please find the given linked list is circular or not?
    //1>2>3>4>5>6>7>8

    if(head == null) return false;

    Node slow = head;
    Node fast = head;

    while(fast.next != null && fast.next.next != null){
        slow = slow.next;
        fast = fast.next.next;

        if(slow == fast)  return true;
       // head = head.next;
    }
    return false;


    /1>2>3>4>5>6>7>8
    // 1
    // 3


    // Sort by Name
    // Thrid highest Salary
    //Given list of employees,
//01. sort employee by employee name
//03. find third heighest sal of the employee

    list.stream().sorted((e1, e2) -> e1.name().compareTo(e2.name())).collect(Collectors.toList());

     list.stream().sorted(Comparator.comparingInt(emp.Salary()).reverserd()).map(pdump.Employee::salary).skip(2).findFirst();





}
*/
