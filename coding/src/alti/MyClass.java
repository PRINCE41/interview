package alti;

class MyClass {
    static int i;
    static {
        i = 10;
    }
}

class Ideone {
    public static void main (String[] args) throws java.lang.Exception {
        MyClass mc = new MyClass();
        System.out.println(mc.i);  // Accessing static variable i
    }
}
