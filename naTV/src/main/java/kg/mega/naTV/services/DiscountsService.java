package kg.mega.naTV.services;

import kg.mega.NaTV.models.dtos.DiscountsDto;
import kg.mega.NaTV.models.dbRequests.DiscountForMainChannelsDbRequestInterface;

import java.util.List;

public interface DiscountsService extends BaseService<DiscountsDto>{
    List<DiscountForMainChannelsDbRequestInterface> getDiscountForMainChannelsDbRequestInterface(Long channelId);
}
