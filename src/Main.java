public class Main {
    public static void main(String[] args) {
        // Task 4: Create an instance of AccessModifiersDemo class
        AccessModifiersDemo demoInstance = new AccessModifiersDemo();

        // Initialize values for the variables
        demoInstance.privateVar = 20;
        demoInstance.defaultVar = 30.5;
        demoInstance.protectedVar = true;
        demoInstance.publicVar = "Hello, World!";

        // Task 4: Access and print the values of variables
        System.out.println("Private Variable Value: " + demoInstance.getPrivateVar());
        System.out.println("Default Variable Value: " + demoInstance.getDefaultVar());
        System.out.println("Protected Variable Value: " + demoInstance.getProtectedVar());
        System.out.println("Public Variable Value: " + demoInstance.getPublicVar());

        // Task 5: Test Subclass Access
        SubclassDemo subDemoInstance = new SubclassDemo();
        subDemoInstance.displayProtectedVar();
    }
}