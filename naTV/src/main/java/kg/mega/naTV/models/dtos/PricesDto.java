package kg.mega.naTV.models.dtos;

import kg.mega.NaTV.models.entities.Channels;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PricesDto {

    Long id;
    Channels channelsId;
    Date startDate;
    Date endDate;
    BigDecimal price;
}
