package pdump.pfour;

public class RobotReturnToOrigin {

    public static boolean judgeCircle(String moves) {
        int x = 0, y = 0;  // Starting position at the origin (0, 0)

        for (char move : moves.toCharArray()) {
            switch (move) {
                case 'R': x++; break;  // Move right
                case 'L': x--; break;  // Move left
                case 'U': y++; break;  // Move up
                case 'D': y--; break;  // Move down
            }
        }

        // Check if the robot is back at the origin
        return x == 0 && y == 0;
    }

    public static void main(String[] args) {
        String moves1 = "UD";
        System.out.println(judgeCircle(moves1));  // Output: true

        String moves2 = "LL";
        System.out.println(judgeCircle(moves2));  // Output: false
    }
}
