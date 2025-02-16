package ReflectionProblems.AdvancedLevel.DependencyInjectionusingReflection;

public class TestDI {
    public static void main(String[] args) {
        UserService userService = new UserService();
        DIContainer.injectDependencies(userService);
        userService.performAction();
    }
}
