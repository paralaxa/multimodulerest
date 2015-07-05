package sk.stopangin.rest;

import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import sk.stopangin.to.ExpenseDto;

import java.util.ArrayList;
import java.util.List;

@Component
public class MyRestClient{

    private RestTemplate restTemplate = new RestTemplate();

    public ExpenseDto getExpense(ExpenseDto expenseDto){
        final List<ClientHttpRequestInterceptor> interceptors = new ArrayList<ClientHttpRequestInterceptor>();
        interceptors.add(new BasicAuthInterceptor("bobak", "password"));
        restTemplate.setInterceptors(interceptors);
        return restTemplate.getForObject("http://localhost:8080/expensev3/getFirstExpense", expenseDto.getClass());
    }

}
