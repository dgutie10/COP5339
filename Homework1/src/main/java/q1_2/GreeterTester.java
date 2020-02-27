package q1_2;

public class GreeterTester {

    public static void main(String[] args) {
        Greeter worldGreeter = new Greeter("World");
        String greeting = worldGreeter.sayHello();
        System.out.println(greeting);

        worldGreeter.swapNames("Bella");
        System.out.println(worldGreeter.sayHello());
        Greeter g2 = worldGreeter.createQualifiedGreeter("Dude");
        System.out.println(g2.sayHello());
    }
}
