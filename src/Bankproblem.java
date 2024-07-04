public class Bankproblem {
    private String account;
    private String deposit;
    private String withdraw;
    private String balance;

    public Bankproblem(String account, String deposit, int withdraw) {
        this.account = account;
        this.deposit = deposit;
        this.withdraw = String.valueOf(withdraw);
//        this.balance = balance;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }

    public String getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(String withdraw) {
        this.withdraw = withdraw;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }
}
