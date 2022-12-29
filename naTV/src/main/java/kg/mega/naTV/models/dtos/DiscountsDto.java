package kg.mega.naTV.models.dtos;

import kg.mega.NaTV.models.entities.Channels;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DiscountsDto {

    Long id;
    Channels channelsId;
    Double percent;
    Date startDate;
    Date endDate;
    Integer minDays;
}
