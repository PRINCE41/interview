package pdump.temp;

public class RobotBoundedInCircle {

    public static boolean isRobotBounded(String instructions) {
        // Directions are in the order: north, east, south, west
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int x = 0, y = 0;  // Initial position
        int directionIndex = 0;  // Initially facing north

        for (char instruction : instructions.toCharArray()) {
            if (instruction == 'G') {
                // Move forward in the current direction
                x += directions[directionIndex][0];
                y += directions[directionIndex][1];
            } else if (instruction == 'L') {
                // Turn left: move to the previous direction (anti-clockwise)
                directionIndex = (directionIndex + 3) % 4;
            } else if (instruction == 'R') {
                // Turn right: move to the next direction (clockwise)
                directionIndex = (directionIndex + 1) % 4;
            }
        }

        // After the first execution of the instructions:
        // The robot is in a circle if it is either back at the origin
        // or it is facing a direction other than north
        return (x == 0 && y == 0) || (directionIndex != 0);
    }

    public static void main(String[] args) {
        // Example 1
        String instructions1 = "GGLLGG";
        System.out.println(isRobotBounded(instructions1));  // Output: true

        // Example 2
        String instructions2 = "GG";
        System.out.println(isRobotBounded(instructions2));  // Output: false

        // Example 3
        String instructions3 = "GL";
        System.out.println(isRobotBounded(instructions3));  // Output: true
    }
}
