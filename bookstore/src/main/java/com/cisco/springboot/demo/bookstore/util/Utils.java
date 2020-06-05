package com.cisco.springboot.demo.bookstore.util;

import org.springframework.web.client.RestTemplate;

public class Utils {
    public static RestTemplate restTemplate = new RestTemplate();

    /**
     * Send a POST request to the specified URL with the given object in the request body.
     *
     * @param url
     * @param body
     * @param responseType
     * @param <T>
     * @return
     */
    public static <T> T postRequest(String url, Object body, Class<T> responseType) {
        return restTemplate.postForObject(url, body, responseType);
    }
}
