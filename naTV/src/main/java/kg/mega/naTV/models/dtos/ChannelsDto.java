package kg.mega.naTV.models.dtos;

import lombok.*;
import lombok.experimental.FieldDefaults;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChannelsDto {

    Long id;
    String name;
    String photo;
    Boolean active;
    Integer orderNum;
}
