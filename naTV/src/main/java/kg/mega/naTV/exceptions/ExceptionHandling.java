package kg.mega.naTV.exceptions;

import kg.mega.NaTV.models.responses.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandling {

    @ExceptionHandler({EntityNotFoundException.class})
    public ResponseEntity<?> handlerCreateEntityException(EntityNotFoundException e) {
        return new ResponseEntity(Response.getErrorResponse(e.getMessage()), HttpStatus.NOT_FOUND);
    }
}
