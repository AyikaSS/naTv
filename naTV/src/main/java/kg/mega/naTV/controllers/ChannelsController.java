package kg.mega.naTV.controllers;

import io.swagger.annotations.Api;
import kg.mega.NaTV.configurations.Swagger2Configuration;
import kg.mega.NaTV.models.dtos.ChannelsDto;
import kg.mega.NaTV.services.ChannelsService;
import kg.mega.naTV.configurations.Swagger2Configuration;
import kg.mega.naTV.models.dtos.ChannelsDto;
import kg.mega.naTV.services.ChannelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/channels")
@Api(tags = Swagger2Configuration.CHANNELS)
public class ChannelsController {

    private final ChannelsService service;

    @Autowired
    public ChannelsController(ChannelsService service) {
        this.service = service;
    }

    @PostMapping("/save")
    ResponseEntity<?> save (@RequestBody ChannelsDto dto){
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

    @GetMapping("/getAll")
    ResponseEntity<?> getAll (){
        try{
            return ResponseEntity.ok(service.findAll());
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.I_AM_A_TEAPOT);
        }
    }

    @GetMapping("/getAllResponse")
    ResponseEntity<?> getAllResponse (){
        try{
            return ResponseEntity.ok(service.getChannelsWithoutDiscountsInterface());
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.I_AM_A_TEAPOT);
        }
    }


    @GetMapping("/getAllResponseTest")
    ResponseEntity<?> getAllResponseTest (){
        try{
            return ResponseEntity.ok(service.getChannelsMain());
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.I_AM_A_TEAPOT);
        }
    }
}
