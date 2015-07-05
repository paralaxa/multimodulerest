package sk.stopangin.rest;

import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.client.support.HttpRequestWrapper;
import sk.stopangin.rest.util.BasicAuthUtil;

import java.io.IOException;

/**
 * Created by myPC on 5. 7. 2015.
 */
public class BasicAuthInterceptor implements ClientHttpRequestInterceptor {

    private String name, password;

    public BasicAuthInterceptor(String name, String password) {
        this.name=name;
        this.password=password;
    }

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body,
                                        ClientHttpRequestExecution execution) throws IOException {

        HttpRequestWrapper requestWrapper = new HttpRequestWrapper(request);
        final String basicAuthStringFromNameAndPassword = BasicAuthUtil.createBasicAuthStringFromNameAndPassword(name, password);
        request.getHeaders().add( "Authorization", basicAuthStringFromNameAndPassword );

        return execution.execute(requestWrapper, body);
    }
}
