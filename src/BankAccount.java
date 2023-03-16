public class BankAccount {

    double amount;
    double sum2;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount += sum;
    }

    public void withDraw(double sum) throws LimitException {

        if (amount < sum) {
            throw new LimitException("Не достаточно средств, ваш остаток " + amount + " списан ", sum2 = amount - amount);
        }
        amount = amount - sum;
    }
}
