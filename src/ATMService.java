import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ATMService {
    private double balance;
    private double withdrawAmount;
    private double deposit;
    private final Date now = new Date();

    public void setWithdrawAmount (double withdrawAmount) {
        if ( withdrawAmount <= balance) {
            balance -= withdrawAmount;
            this.withdrawAmount += withdrawAmount;
            String formattedBalance = NumberFormat.getCurrencyInstance().format(balance);
            System.out.println(withdrawAmount + " withdrawn from your account, current balance is: " + formattedBalance);
        }
        else
            System.out.println("Error! Insufficient amount in your account\n");
    }

    public void setDeposit(double deposit) {
        balance += deposit;
        this.deposit += deposit;
        String formattedBalance = NumberFormat.getCurrencyInstance().format(balance);
        System.out.println(deposit + " deposited successfully on "
                + getCurrentDate() + " at " + getCurrentTime() + " " +
                ". Current balance is " + formattedBalance + "\n ");
    }

    private String getCurrentDate() {
        return dateFormat("dd/MM/yyyy").format(now);
    }

    private String getCurrentTime() {
        return dateFormat("HH:mm:ss").format(now);
    }

    private SimpleDateFormat dateFormat(String pattern) {
        return new SimpleDateFormat(pattern);
    }

    public String getWithdrawAmount () {
        return NumberFormat.getCurrencyInstance().format(withdrawAmount);
    }
    public String getDeposit () {
        return NumberFormat.getCurrencyInstance().format(deposit);
    }
    public String getBalance () {
        return NumberFormat.getCurrencyInstance().format(balance);
    }
}
