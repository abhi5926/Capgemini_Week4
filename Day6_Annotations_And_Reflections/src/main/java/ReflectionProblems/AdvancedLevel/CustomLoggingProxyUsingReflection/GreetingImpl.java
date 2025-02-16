package ReflectionProblems.AdvancedLevel.CustomLoggingProxyUsingReflection;

public class GreetingImpl implements Greeting {
    @Override
    public void sayHello() {
        System.out.println("Hello, world!");
    }

    @Override
    public void sayGoodbye() {
        System.out.println("Goodbye, world!");
    }
}
