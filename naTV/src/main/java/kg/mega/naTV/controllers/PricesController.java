package kg.mega.naTV.controllers;

import io.swagger.annotations.Api;
import kg.mega.NaTV.configurations.Swagger2Configuration;
import kg.mega.NaTV.models.dtos.PricesDto;
import kg.mega.NaTV.services.PricesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/prices")
@Api(tags = Swagger2Configuration.PRICES)
public class PricesController {
    private final PricesService service;

    @Autowired
    public PricesController(PricesService service) {
        this.service = service;
    }
    @PostMapping("/save")
    ResponseEntity<?> save (@RequestBody PricesDto dto){
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
