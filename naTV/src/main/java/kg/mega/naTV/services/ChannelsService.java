package kg.mega.naTV.services;

import kg.mega.NaTV.models.dtos.ChannelsDto;
import kg.mega.NaTV.models.dbRequests.MainChannelDbRequestInterface;
import kg.mega.NaTV.models.responses.MainChannelsResponse;

import java.util.List;

public interface ChannelsService extends BaseService<ChannelsDto>{

     List<MainChannelDbRequestInterface> getChannelsWithoutDiscountsInterface();

     List<MainChannelsResponse> getChannelsMain();
}
