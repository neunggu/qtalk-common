package com.quack.talk.common.util;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@RequiredArgsConstructor
@Component
public class ApiUtil {

    protected Logger logger = LoggerFactory.getLogger(ApiUtil.class);

    private final RestTemplate template;

    public <T> T get(String url, Class<T> TClass) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        ResponseEntity<T> result = template.exchange(url, HttpMethod.GET, new HttpEntity<>(null, headers), TClass);
        return result.getBody();
    }

    public <T> T get(String url, Class<T> TClass, HttpHeaders headers) {
        ResponseEntity<T> result = template.exchange(url, HttpMethod.GET, new HttpEntity<>(null, headers), TClass);
        return result.getBody();
    }

    public <T> T post(String url, Object body, Class<T> TClass) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        ResponseEntity<T> result = template.exchange(url, HttpMethod.POST, new HttpEntity<>(body, headers), TClass);
        return result.getBody();
    }

    public <T> T post(URI url, Object body, Class<T> TClass) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        ResponseEntity<T> result = template.exchange(url, HttpMethod.POST, new HttpEntity<>(body, headers), TClass);
        return result.getBody();
    }

    public <T> T post(String url, Object body, Class<T> TClass, HttpHeaders headers) {
        ResponseEntity<T> result = template.exchange(url, HttpMethod.POST, new HttpEntity<>(body, headers), TClass);
        return result.getBody();
    }

}
