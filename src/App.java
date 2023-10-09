public class App {
    public static void main(String[] args) throws Exception {
        Person person = new Person();
        person.setName("John");
        person.setAge(30);

        System.out.println("Name:  "+ person.getName());
         System.out.println("Name:  "+ person.getAge());

    }
}
