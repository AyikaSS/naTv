package kg.megacom.httptest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/http/test")
public class HttpTestController {
    GetMapping("/get/text")
    String getText(){}
}
