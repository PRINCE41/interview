package pdump.ptwo;

public class TestClass {
    public static void main(String[] args) {
        FunctionalC function = () -> System.out.println("Hi");

        function.show();
    }
}
