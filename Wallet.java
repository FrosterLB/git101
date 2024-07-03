public class Wallet {
    private double balance;
    private double totalSpent;
    private int point;

    public Wallet(){
        balance = 0.0;
        totalSpent = 0.0;
        point = 0;
    }

    public void addFund(double amount){
        balance += amount;
    }
    public void spend(double amount){
        balance -= amount;
        totalSpent += amount;
        point += (int) (amount/50);
    }

    public void usePoint(int pointToUse){
        point -= pointToUse;
    }

    public double getBalance() {
        return balance;
    }

    public double getTotalSpent() {
        return totalSpent;
    }

    public int getPoint() {
        return point;
    }
}


