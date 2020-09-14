package Tasks.Module_1_6.structural.facade;

public class Developer {
    public void doJobBeforeDeadline(BugTracker bugTracker){
        if (bugTracker.isActiveSprint()){
            System.out.println("Developer is soving problems...");
        } else {
            System.out.println("Developer reading book");
        }
    }
}
