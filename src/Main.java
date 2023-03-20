public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to ATM machine");
        Validation.validateUser();

        var report = new ATMReport(new ATMService());
        report.optionMenu();
    }
}