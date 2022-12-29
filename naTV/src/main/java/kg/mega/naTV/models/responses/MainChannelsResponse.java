package kg.mega.naTV.models.responses;

import kg.mega.NaTV.models.dbRequests.DiscountForMainChannelsDbRequestInterface;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MainChannelsResponse {

    Long id;
    String name;
    String image;
    BigDecimal price;
    List<DiscountForMainChannelsDbRequestInterface> discountMinDaysResponses;




}
