public class NamespaceExample {
    static class userDefined {
        static int insideNamespace = 42;
        static int cout() {
            return insideNamespace;
        }
    }
 
    static int myGlobal = 10;

    static int cout() {
        return myGlobal * myGlobal;
    }

    public static void main(String[] args) {
        int cout = 5;
        System.out.println("The local variable cout in main is " + cout);
        System.out.println("The variable in userDefined namespace is " + userDefined.insideNamespace);
        System.out.println("The output of cout() in userDefined is " + userDefined.cout());
        System.out.println("The value of myGlobal is " + myGlobal);
        System.out.println("The output of global cout() is " + cout());
    }
}
