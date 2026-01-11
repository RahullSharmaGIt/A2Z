public class Demo {

    // ✅ Static method - belongs to the class
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }

    // ✅ Non-static method - belongs to the object
    static public void nonStaticMethod() {
        System.out.println("This is a non-static method.");
    }

    public static void main(String[] args) {

        // 🔸 Call static method directly using class name
        Demo.nonStaticMethod();

        // 🔸 Create object to call non-static method
        Demo obj = new Demo();
        obj.nonStaticMethod();
    }
}
