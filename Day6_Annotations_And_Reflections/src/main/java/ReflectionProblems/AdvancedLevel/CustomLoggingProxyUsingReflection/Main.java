package ReflectionProblems.AdvancedLevel.CustomLoggingProxyUsingReflection;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        // Create the real object (GreetingImpl)
        Greeting greeting = new GreetingImpl();

        // Create a dynamic proxy that logs method calls
        Greeting proxyGreeting = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class[]{Greeting.class},
                new LoggingHandle(greeting)
        );

        // Call methods on the proxy
        proxyGreeting.sayHello();
        proxyGreeting.sayGoodbye();
    }
}
