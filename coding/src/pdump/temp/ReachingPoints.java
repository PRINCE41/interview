package pdump.temp;

public class ReachingPoints {

    public static boolean reachingPoints(int sx, int sy, int tx, int ty) {
        // Work backwards from (tx, ty) to (sx, sy)
        while (tx > sx && ty > sy) {
            if (tx > ty) {
                tx %= ty;  // Reduce tx by ty (tx = tx % ty)
            } else {
                ty %= tx;  // Reduce ty by tx (ty = ty % tx)
            }
        }

        // If either tx == sx, check if ty can be reduced to sy by subtracting multiples of tx
        // Similarly, if ty == sy, check if tx can be reduced to sx by subtracting multiples of ty
        return (tx == sx && ty >= sy && (ty - sy) % sx == 0) || 
               (ty == sy && tx >= sx && (tx - sx) % sy == 0);
    }

    public static void main(String[] args) {
        // Example 1
        System.out.println(reachingPoints(1, 1, 3, 5));  // Output: true

        // Example 2
        System.out.println(reachingPoints(1, 1, 2, 2));  // Output: false

        // Example 3
        System.out.println(reachingPoints(1, 1, 1, 1));  // Output: true
    }
}
