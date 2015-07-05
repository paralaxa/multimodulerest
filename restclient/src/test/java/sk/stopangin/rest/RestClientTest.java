package sk.stopangin.rest;


import org.junit.Assert;
import org.junit.Test;
import sk.stopangin.to.ExpenseDto;

/**
 * Created by myPC on 5. 7. 2015.
 */
public class RestClientTest {

    @Test
    public void testRestData() {
        MyRestClient myRestClient = new MyRestClient();
        final ExpenseDto expense = myRestClient.getExpense(new ExpenseDto());
        Assert.assertNotNull(expense);
    }
}
