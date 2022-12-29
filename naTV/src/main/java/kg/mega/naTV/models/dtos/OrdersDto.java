package kg.mega.naTV.models.dtos;

import kg.mega.NaTV.models.enums.Status;
import lombok.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrdersDto {


    Long id;
    String text;
    String name;
    String phone;
    String email;
    Double totalPrice;
    Date editDate;
    Date addDate;
    Status status;


}

