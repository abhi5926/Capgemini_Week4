package ReflectionProblems.AdvancedLevel.CreateaCustomObjectMapper;

class Person {
    private String name;
    private int age;

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // To display the values of the object
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
