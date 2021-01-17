package entities.Inheritance;


/*
"Final" em classes evita que a classe seja herdada.
 */
public class SavingsAccount extends Account{
    private Double interestRate;

    public SavingsAccount(){
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void updateBalance(){
        balance += balance * interestRate;
    }

    /*
    "Final" no metodo evita que o metodo seja sobreposto.
     */
    @Override
    public final void withdraw(double amount) {
        balance -= amount;
    }
}

