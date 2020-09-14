package Tasks.Module_1_6.creational.singleton;

public class History {
    private static History history;
    private String loghistory = "This is my story...\n\n";

    public static synchronized History getHistory(){
        if (history == null){
            history = new History();
        }
        return history;
    }

    private History(){};

    public void addLogHistory(String txt){
        loghistory += txt + "\n";
    }

    public void showHistory(){
        System.out.println(loghistory);
    }

}
