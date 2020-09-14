package Tasks.Module_1_6.structural.decorator;

public class Runner {
    public static void main(String[] args) {
        Worker worker = new BossEconomist(new SeniorEconomist(new Economist()));

        System.out.println(worker.makeJob());
    }
}
