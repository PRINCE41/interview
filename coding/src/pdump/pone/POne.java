package pdump.pone;

public class POne {

    public static void main(String[] args) {
        int[] arr = new int[]{1,0,1,1,0,1};
        int maxOnes = 0;
        int counter = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                counter = 0;
            }else{
                counter++;
            }
            maxOnes = Math.max(maxOnes, counter);
        }

        System.out.println(maxOnes);
    }
}
