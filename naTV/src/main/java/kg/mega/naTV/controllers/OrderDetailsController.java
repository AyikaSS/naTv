package kg.mega.naTV.controllers;

import io.swagger.annotations.Api;
import kg.mega.NaTV.configurations.Swagger2Configuration;
import kg.mega.NaTV.models.dtos.ChannelsDto;
import kg.mega.NaTV.models.dtos.OrderDetailsDto;
import kg.mega.NaTV.services.OrderDetailsService;
import kg.mega.naTV.configurations.Swagger2Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orderDetails")
@Api(tags = Swagger2Configuration.OrderDETAILS)
public class OrderDetailsController {

    private final OrderDetailsService service;

    @Autowired
    public OrderDetailsController(OrderDetailsService service) {
        this.service = service;
    }
    @PostMapping("/save")
    ResponseEntity<?> save (@RequestBody OrderDetailsDto dto){
        try{
            return ResponseEntity.ok(service.save(dto));
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.I_AM_A_TEAPOT);
        }
    }

    @GetMapping("/findById")
    ResponseEntity<?> findById (@RequestParam Long id, @RequestHeader int language){

            return ResponseEntity.ok(service.findById(id, language));
    }

    @GetMapping("/findAll")
    ResponseEntity<?> findAll (){
        try{
            return ResponseEntity.ok(service.findAll());
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.I_AM_A_TEAPOT);
        }
    }
}
