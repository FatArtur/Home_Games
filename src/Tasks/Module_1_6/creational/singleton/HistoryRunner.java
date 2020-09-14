package Tasks.Module_1_6.creational.singleton;

public class HistoryRunner {
    public static void main(String[] args) {
        History.getHistory().addLogHistory("Day 1...");
        History.getHistory().addLogHistory("Day 2...");
        History.getHistory().addLogHistory("Day 3...");

        History.getHistory().showHistory();
    }
}
