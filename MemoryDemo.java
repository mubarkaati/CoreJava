public class MemoryDemo {

    String name;

    static String var = "aa";

    final String s1;

    public MemoryDemo(String s) {
        this.s1 = s;
    }

    public static void main(String[] args) {
        //12345
        MemoryDemo memoryDemo = new MemoryDemo("abc");
        memoryDemo.name = "abc";
        String s = new String("euyue");
        //98745
        MemoryDemo memoryDemo1 = new MemoryDemo("abc");
        memoryDemo1.name = "abc2";
        memoryDemo1.add(1,4, memoryDemo1);

        System.out.println("**************");
        MemoryDemo memoryDemo2 = new MemoryDemo("");
        memoryDemo2.name = "a";
        MemoryDemo memoryDemo3 = memoryDemo2;
        memoryDemo3.name = "b";
        System.out.println(memoryDemo2.name);
        System.out.println(memoryDemo3.name);

        System.out.println(MemoryDemo.var);
        MemoryDemo.var = "i";
        System.out.println(MemoryDemo.var);
    }

    //static-add (s1, s2, s3)

    public Integer add(int a, int b, MemoryDemo memoryDemo) {
        System.out.println("A : " + a);
        System.out.println("B : " + b);

        A aObj = new B();
        aObj.hello();


        return a + b;
    }
}


class A {
    String nameA;

    public void hello() {
        System.out.println("Hello from A");
    }
}

class B extends A {

    String nameB;

    public void hello() {
        System.out.println("Hello from B");
    }
}