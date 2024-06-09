package bank;

public class Account {
    private String owner;

    private long balance;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void Account(){}

    public  void Account(String owner){
        this.owner = owner;
    }
    public  void Account(long balance){
        this.balance=balance;
    }
    public  void Account(String owner, long balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public long deposit (long amount){
        this.balance += amount;
        return this.balance;
    }

    public long withDraw(long amount){
        if (amount > balance) {
            System.out.println("한도초과");
            System.out.print("지금 잔고는");
            return this.balance;
        }else {
            this.balance -= amount;
            return this.balance;
        }
    }
}
