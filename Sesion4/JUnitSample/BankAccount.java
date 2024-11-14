package JUnitSample;

public class BankAccount {
    private Double balance; 
    private String token; 

    public BankAccount (Double initialBalance, String bankToken) 
    { 
        //constructor 
        balance = initialBalance; 
        token = bankToken; 
    }

    public Double Deposit(Double q) 
    {
        //receipt money
        balance += q; 
        return balance;  
    }

    public Double WithDrawal(Double q, String cc) 
    {    
        //if token match and balance is enough 
        if (token.equals(cc)) 
            if (balance >= q) {
                balance = balance - q; 
                return q; 
            }
            else 
                return (double) -1; 
        else 
            return (double) -2; 
    }

    public Double GetBalance() 
    {  
        return balance; 
    }
}

