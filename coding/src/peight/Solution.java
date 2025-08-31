package peight;

public class Solution {
    public static void main(String[] args) {
        String[] strAr1 = {};
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < strAr1[0].length(); i++){
            char temp = strAr1[0].charAt(i);
            for(int j = 1; j < strAr1.length; j++){
                if(strAr1[j].length() >= i  && temp != strAr1[j].charAt(i)) {
                    i = strAr1[0].length();
                    break;

                }
            }
            result.append(String.valueOf(temp));

        }

        System.out.println(result);
    }
}
