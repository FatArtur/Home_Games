package Tasks.Module_1_6.creational.prototype;

public class Runner {
    public static void main(String[] args) {
        Student master = new Student("Ivan", 3, "Bank");

        System.out.println(master);

        StudentFactory factory = new StudentFactory(master);
        Student masterCopy = factory.cloneStudent();
        System.out.println("\n================\n");
        System.out.println(masterCopy);
    }
}
