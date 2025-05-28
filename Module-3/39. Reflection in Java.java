import java.lang.reflect.Method;

class Demo {
    public void sayHello() {
        System.out.println("Hello via Reflection!");
    }
}

public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("Demo");
        Object obj = clazz.getDeclaredConstructor().newInstance();
        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println("Invoking: " + method.getName());
            method.invoke(obj);
        }
    }
}
