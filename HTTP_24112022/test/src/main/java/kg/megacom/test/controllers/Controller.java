package kg.megacom.test.controllers;

import kg.megacom.test.services.CountryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/main")

public class Controller {
    CountryService countryService = new CountryService();

        @GetMapping("/country/get/all")
        public
}
