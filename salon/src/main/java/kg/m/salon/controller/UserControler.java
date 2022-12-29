package kg.m.salon.controller;

import kg.m.salon.models.dto.UserDto;
import kg.m.salon.service.UserSerevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/user")
public class UserControler {
    @Autowired
    private UserSerevice serevice;

    @PostMapping("/save")
    public ResponseEntity<?>save(@RequestBody UserDto userDto) {
        try {
            return ResponseEntity.ok(serevice.save(userDto));

        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.I_AM_A_TEAPOT);

        }
    }
}
