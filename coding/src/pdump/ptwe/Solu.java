package pdump.ptwe;

public class Solu {
    public static void main(String[] args) {

      /*  input: Aman2024
        output: aMAN2024*/

        //a to z: 97 to 122
        // 65-90
        String input = "Aman2024";
        System.out.println(converted(input));
    }

    private static String converted(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length();i++){
            if(input.charAt(i) >= 65 && input.charAt(i) <= 90){
                sb.append((char)(input.charAt(i)+32));
            } else if (input.charAt(i) >= 97 && input.charAt(i) <= 122) {
                sb.append((char)(input.charAt(i)-32));
            }else{
                sb.append(input.charAt(i));
            }
        }
      /*  char pdump.temp = 'a';
        char tem1 = (char)(pdump.temp-32);
        System.out.println(tem1);*/

        //System.out.println(Character.toChars(97));

        return sb.toString();
    }
}
