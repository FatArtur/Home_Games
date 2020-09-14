package Tasks.Module_1_6.structural.decorator;

public class BossEconomist extends WorkerDecorator{
    public BossEconomist(Worker worker) {
        super(worker);
    }

    public String jodBoss(){
        return "Предоставляет отчеты руководству. ";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + jodBoss();
    }
}
