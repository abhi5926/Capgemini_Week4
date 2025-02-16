package ReflectionProblems.BasicLevel.GetClassInformation;
import java.util.Scanner;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Field;

public class ClassInformation {
    // Method
    public void classInformation(String name){
        try {
            // Load class
            Class<?> ob = Class.forName(name);

            // Method printing
            Method[] methods = ob.getDeclaredMethods();
            System.out.println("Methods :");
            for (Method method : methods) {
                System.out.println(method);
            }
            // Printing Fileds Of class
            Field[] fields = ob.getDeclaredFields();
            System.out.println("Fileds ");
            for (Field field : fields) {
                System.out.println(field);
            }

            // Printing Constructor
            Constructor<?>[] constructors = ob.getDeclaredConstructors();
            System.out.println("Constructors :");
            for (Constructor constructor : constructors) {
                System.out.println(constructor);
            }
        }catch(ClassNotFoundException e){
            System.out.println("class Not Found "+name);
        }
    }
    public static void main(String[] args) {
        // Creating Scanner Class Object
        Scanner sc = new Scanner(System.in);
        // Taking class Name as Input
        String name;
        System.out.println("Enter the class Name");
        name = sc.nextLine();

        // Creating Class object
        ClassInformation ob = new ClassInformation();

        // Method calling
        ob.classInformation(name);

    }
}
