package Tasks.Module_1_6.structural.composite;

public class ProgramRunner {
    public static void main(String[] args) {
        Team team = new Team();

        Animal cat1 = new Cat();
        Animal cat2 = new Cat();
        Animal dog = new Dog();

        team.addAnimal(cat1);
        team.addAnimal(cat2);
        team.addAnimal(dog);

        team.songAnimals();
    }
}
