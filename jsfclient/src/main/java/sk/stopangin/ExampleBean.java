package sk.stopangin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sk.stopangin.to.ExpenseDto;

//@ManagedBean
@Component
public class ExampleBean {

//    @ManagedProperty(value = "#{exampleService}")
    @Autowired
    private ExampleService exampleService;

    public ExpenseDto getFirstExpense() {
        return exampleService.readfirst();
    }



}
