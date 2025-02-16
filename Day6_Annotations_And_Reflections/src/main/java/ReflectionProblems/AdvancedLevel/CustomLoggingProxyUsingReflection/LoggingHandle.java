package ReflectionProblems.AdvancedLevel.CustomLoggingProxyUsingReflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LoggingHandle implements InvocationHandler {
    private final Object target;

    // Constructor to accept the real object
    public LoggingHandle(Object target) {
        this.target = target;
    }

    // Overriding the invoke method to intercept method calls
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // Log the method name before invoking the actual method
        System.out.println("Calling method: " + method.getName());

        // Invoke the actual method on the real object
        return method.invoke(target, args);
    }
}
