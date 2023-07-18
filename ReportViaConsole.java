package homework;

public class ReportViaConsole implements Reportable {
    Persister persister;

    public ReportViaConsole(Persister persister) {
        this.persister = persister;
    }

    @Override
    public void reportUser(User user) {
        boolean flag = false;
        for (User item: persister.getUsers()) {
            if (user.getName().equals(item.getName())){
                System.out.println("Report for User via Console: ....");
                flag = true;
            }
        }
        if(flag == false){
            System.out.println("User not found");
        }
    }
}
