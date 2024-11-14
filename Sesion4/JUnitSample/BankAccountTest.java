package JUnitSample;

import junit.framework.*;
import org.junit.Assert;
import org.junit.Test;

public class BankAccountTest extends TestCase {

    private BankAccount myAccount;

    public BankAccountTest(String name) {
        super(name);
    }
    
    //TestCases - Success Flow
    @Test
    public void testWhenDeposit_Expect_BalanceCorrect(){
        //Pattern AAA

        //Arrange
        Double balance;
        Double newBalance;
        Double deposit = 500.00; 
        myAccount = AccountFactory.MockBankAccount1();
        balance = myAccount.GetBalance();
        
        //Act
        newBalance = myAccount.Deposit(deposit);
        balance = balance + deposit;

        //Assert
        Assert.assertEquals(balance, newBalance);
    }

    @Test
    public void testWhenWithDrawal_Expect_BalanceCorrect(){
        //Pattern AAA

        //Arrange
        Double withDrawal = 300.00;
        Double expectedResponse;
        Double response;
        Double newBalance; 
        myAccount = AccountFactory.MockBankAccount2();
        expectedResponse = AccountFactory.GetBalance();
        String  bankToken =  AccountFactory.GetToken();


        //Act
        response = myAccount.WithDrawal(withDrawal, bankToken);
        newBalance = myAccount.GetBalance();
        expectedResponse = expectedResponse - response;

        //Assert
        Assert.assertEquals(expectedResponse,newBalance);
    }

    //TestCases - Error Flow
    @Test
    public void testWhenWithDrawal_Expect_BalanceNotEnough(){
        //Pattern AAA

        //Arrange
        Double withDrawal = 1000.00;
        Double expectedResponse = -1.00;
        Double response;
        myAccount = AccountFactory.MockBankAccount2();
        String  bankToken =  AccountFactory.GetToken();

        //Act
        response = myAccount.WithDrawal(withDrawal, bankToken);

        //Assert
        Assert.assertEquals(expectedResponse,response);
    }

    @Test
    public void testWhenWithDrawal_Expect_TokenInvalid(){
         //Pattern AAA

         //Arrange
         Double withDrawal = 1000.00;
         Double expectedResponse = -2.00;
         Double response;
         myAccount = AccountFactory.MockBankAccount2();
         String  bankToken =  AccountFactory.MockBadToken();

         //Act
         response = myAccount.WithDrawal(withDrawal, bankToken);

         //Assert
         Assert.assertEquals(expectedResponse,response);
     }

    public static TestSuite Suite(){
        TestSuite suite = new TestSuite(BankAccountTest.class);
        return suite;
    }

    public static void main(String[] args){
        junit.textui.TestRunner.run(Suite());
    }
}