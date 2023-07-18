package homework;

public class Main{
    public static void main(String[] args){
        User user1 = new User("Bob");
        User user2 = new User("Ann");
        Persister persister = new Persister();
        persister.addUser(user1);
        persister.saveUser(user1);
        persister.addUser(user2);
        persister.saveUser(user2);
        ReportViaConsole reportViaConsole = new ReportViaConsole(persister);
        reportViaConsole.reportUser(user1);
        ReportViaPrinter reportViaPrinter = new ReportViaPrinter(persister);
        reportViaPrinter.reportUser(user2);
        persister.deleteUser(user1);
        reportViaConsole.reportUser(user1);
        reportViaPrinter.reportUser(user2);
    }
}