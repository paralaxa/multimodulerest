package sk.stopangin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sk.stopangin.rest.MyRestClient;
import sk.stopangin.to.ExpenseDto;

@Service
public class ExampleService {

    @Autowired
    private MyRestClient myRestClient;

    public ExpenseDto readfirst() {
        return myRestClient.getExpense(new ExpenseDto());
    }

}
