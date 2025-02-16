package ReflectionProblems.AdvancedLevel.DependencyInjectionusingReflection;


import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Inject {}
