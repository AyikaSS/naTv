package kg.mega.naTV.models.dtos;

import kg.mega.NaTV.models.entities.Channels;
import kg.mega.NaTV.models.entities.Orders;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderDetailsDto {

    Long id;
    Channels channelsId;
    Orders ordersId;
    Double price;
}
