package pdump.pf;

public class Printpattern {
    public static void main(String[] args) {
        int rows = (7 + 1) / 2;
        for(int i = 1; i <= rows; i++){
            StringBuilder sb = new StringBuilder();
            for(int j = rows-1; j >= i; j--){
                sb.append(" ");
            }
            for(int j = 1; j <=(2*i-1); j++){
                sb.append("*");
            }
            /*for(int j = rows-1; j >= i; j--){
                sb.append(" ");
            }*/
            System.out.println(sb);
        }

       /* for (int i = 0; i < 7/2; i++) {
            for (int j = 0; j < ; j++) {
                
            }
        }*/
    }
}
