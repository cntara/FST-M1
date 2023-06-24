package Activities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Activity2 {

    @Test
    public void notEnoughFunds(){

        BankAccount account = new BankAccount(9);

        // Assertion for exception
        assertThrows(NotEnoughFundsException.class, () -> account.withdraw(100),"Balance should be greater than withdrawal");
    }
@Test
    public void enoughFunds(){
    BankAccount account=new BankAccount(10);
    assertDoesNotThrow(()-> account.withdraw(5));
}

}
