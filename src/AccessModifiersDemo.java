// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class AccessModifiersDemo {
    int privateVar;
    double defaultVar; // package-private
    protected boolean protectedVar;
    public String publicVar;

    // Task 2: Implement Methods
    public int getPrivateVar() {
        return privateVar;
    }

    double getDefaultVar() {
        return defaultVar;
    }

    protected boolean getProtectedVar() {
        return protectedVar;
    }

    public String getPublicVar() {
        return publicVar;
    }
}