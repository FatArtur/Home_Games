package Tasks.Module_1_6.structural.decorator;

public class SeniorEconomist extends WorkerDecorator{

    public SeniorEconomist(Worker worker) {
        super(worker);
    }

    public String makeSeniorJob(){
        return "Проводит анализ. ";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeSeniorJob();
    }
}
