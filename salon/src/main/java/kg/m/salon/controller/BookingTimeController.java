package kg.m.salon.controller;

import kg.m.salon.models.dto.BookingTimeDto;
import kg.m.salon.service.BookingTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/book")
public class BookingTimeController {
    @Autowired
    private BookingTimeService service;

    @PostMapping("/save")
    public ResponseEntity<?>save(@RequestBody BookingTimeDto bookingTimeDto){
        try {
            return ResponseEntity.ok(service.save(bookingTimeDto));
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.I_AM_A_TEAPOT);
        }
    }

}
