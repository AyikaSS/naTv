package kg.mega.naTV.models.dtos;

import kg.mega.NaTV.models.entities.OrderDetails;
import lombok.*;
import lombok.experimental.FieldDefaults;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DaysDto {

    Long id;
    OrderDetails orderDetailsId;
    String days;
}