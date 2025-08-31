package pdump.pth;

import java.util.*;

public class Solution {

    //
    public static void main(String[] args) {

       // Input: A + B * C + D

      //  Output: ABC*+D+

      //          Input: ((A + B) – C * (D / E)) + F

     //   Output: AB+CDE/*-F+
        String input = "((A+B)–C*(D/E))+F";
        System.out.println(output(input));





    }

    private static String output(String input) {
        Map<Character,Integer> precedence = new HashMap<>();
        precedence.put('[', 1);
        precedence.put('/', 2);
        precedence.put('*', 3);
        precedence.put('+', 4);
        precedence.put('-', 5);
        Stack<Character> queue = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char ch : input.toCharArray()){
            if(!Character.isAlphabetic(ch)){
                System.out.println("Inside !Character.isAlphabetic(ch)" + ch);
                if(!queue.isEmpty()){
                    System.out.println("precedence.get(queue.peek())" + precedence.get(queue.peek()) + " " + precedence.get(ch));
                    if(precedence.get(queue.peek()) < precedence.get(ch)){
                        System.out.println("Inside precedence.get(queue.peek()) < precedence.get(ch)");
                        while(!queue.isEmpty()){
                            sb.append(queue.pop());
                        }
                        queue.add(ch);
                    }else{
                        queue.add(ch);
                    }
                }
                else{
                       queue.add(ch);
                }

            }else{
                sb.append(ch);

            }
            System.out.println(sb);
            System.out.println(queue);
        }
        while (!queue.isEmpty()){
            sb.append(queue.pop());
        }

        return sb.toString();
    }
}
