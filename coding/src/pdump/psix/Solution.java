/*
package pdump.psix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

   */
/* List<Object> objorlist =
            Arrays.asList(1, 2, 3, 4, '@', 5, 9, 'a', 6, 7, 8, 4, -5, -7,-3, -2, -1);
        1 2 3
        6 7 8
        -3 -2 -1*//*


    public static void main(String[] args) {
        List<Object> objorlist =
                Arrays.asList(1, 2, 3, 4, '@', 5, 9, 'a', 6, 7, 8, 4, -5, -7,-3, -2, -1);

        List<List<Integer>> result = new ArrayList<>();
        int count = 0;
        Integer previous = null;
        for(int i = 0; i < objorlist.size(); i++){
            Integer num = null;
            if(objorlist.get(i) instanceof Integer){
                num = (Integer) objorlist.get(i);
            }
            List<Integer> pdump.temp = List.of();
            if(pdump.temp.size() == 3 || pdump.temp.size() == 0){

                pdump.temp = new ArrayList<>();
            }
            if(num  == previous +1){
               pdump.temp.add(previous);
            }
            previous = num;

        }


    }
}
*/
