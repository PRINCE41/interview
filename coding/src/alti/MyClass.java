package alti;

class MyClass {
    static int i;
    static {
        i = 10;
    }
}

class Ideone {
    public static void main (String[] args) throws Exception {
        MyClass mc = new MyClass();
        MyClass mc2 = new MyClass();
        System.out.println(mc.i);  // Accessing static variable i
    }
}
