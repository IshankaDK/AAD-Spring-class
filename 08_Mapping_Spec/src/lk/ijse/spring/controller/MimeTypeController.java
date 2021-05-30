package lk.ijse.spring.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ishanka on 5/30/21 at 8:44 PM
 * @since 0.0.1
 */
@RestController
@RequestMapping("/api/v1/mime")
public class MimeTypeController {

    // we can narrow down request using request header

    @GetMapping
    public String test1() {
        return "test 1 of MimeTypeController";
    }

    // depend on the request Content-Type
    // filter out if the request content type have application/json content or not
    @GetMapping(consumes = {MediaType.APPLICATION_JSON_VALUE /*"application/json"*/})
    // we can check the type of request
    public String test2() {
        return "Content JSON";
    }

    // filter out if the request content type have application/json content or not
    @GetMapping(consumes = {MediaType.TEXT_HTML_VALUE})
    public String test3() {
        return "Content Text";
    }

    // produce what request sender hope as the response content (define in the accept header)
    @GetMapping(consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public String test4() {
        return "Request Content Type must be application/json - Response Content Type must be application/json";
    }

    @GetMapping(consumes = {MediaType.TEXT_HTML_VALUE}, produces = {MediaType.TEXT_PLAIN_VALUE})
    public String test5() {
        return "Request Content Type must be text/html - Response Content Type must be plain/text";
    }

    @GetMapping(headers = {"Content-Type=text/html", "Accept=text/html"})
    public String test6() {
        return "Request Content Type must be text/html - Response Content Type must be text/html";
    }

}
