package kg.mega.naTV.models.dbRequests;

import java.math.BigDecimal;

public interface MainChannelDbRequestInterface {
    Long getId();
    String getName();
    String getPhoto();
    BigDecimal getPrice();
}
