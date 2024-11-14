package JUnitSample;

public class AccountFactory {

    private static String token;
    private static Double balanceTestCase;

    public static BankAccount MockBankAccount1()
    {
        token = "ee5c41c63714a0e14046fb51d86acfbc";
        balanceTestCase = 1500.00;
        BankAccount account = new BankAccount(balanceTestCase, token);
        return account;
    }
    public static BankAccount MockBankAccount2(){
        token = "ee5c41c63714a0e14046fb51d86acfbc";
        balanceTestCase = 500.00;
        BankAccount account = new BankAccount(balanceTestCase, token);
        return account;
    }
    public static String GetToken(){
        return token;
    }
    public static String MockBadToken(){
        return token + "abcde";
    }
    public static Double GetBalance(){
        return balanceTestCase;
    }
}
