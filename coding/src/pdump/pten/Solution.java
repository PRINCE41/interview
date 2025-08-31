package pdump.pten;

public class Solution {

  /*  below and output exepeceted

    String s = "AAABBBBCCA";

// output exepected - 3A4B2C1A
// basicially it's for above string we are exepecting character count and character as output*/

    public static void main(String[] args) {
        String s = "AAABBBBCCA";
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == s.charAt(i-1)){
                count++;

            }else{
                sb.append(count).append(s.charAt(i-1));
                count =1;

            }

            if(i == s.length()-1){
                sb.append(count).append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
