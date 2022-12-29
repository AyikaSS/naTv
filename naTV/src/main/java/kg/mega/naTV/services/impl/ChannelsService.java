package kg.mega.naTV.services.impl;

import kg.mega.NaTV.exceptions.EntityNotFoundException;
import kg.mega.NaTV.models.dtos.ChannelsDto;
import kg.mega.NaTV.models.mappers.ChannelsMapper;
import kg.mega.NaTV.models.dbRequests.MainChannelDbRequestInterface;
import kg.mega.NaTV.models.responses.MainChannelsResponse;
import kg.mega.NaTV.repositories.ChannelsRepository;
import kg.mega.NaTV.services.ChannelsService;
import kg.mega.NaTV.services.DiscountsService;
import kg.mega.NaTV.services.PricesService;
import kg.mega.NaTV.utils.ResourceBundle;
import kg.mega.NaTV.utils.models.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChannelsService implements ChannelsService {

    private final ChannelsRepository channelsRepository;
    private final PricesService pricesService;
    private final DiscountsService discountsService;

    @Autowired
    public ChannelsService(ChannelsRepository channelsRepository, PricesService pricesService, DiscountsService discountsService) {
        this.channelsRepository = channelsRepository;
        this.pricesService = pricesService;
        this.discountsService = discountsService;
    }


    @Override
    public ChannelsDto save(ChannelsDto channelsDto) {
        return ChannelsMapper.INSTANCE.toDto(channelsRepository.save(ChannelsMapper.INSTANCE.toEntity(channelsDto)));
    }

    @Override
    public ChannelsDto findById(Long id, int language) {
        Language lang = Language.getLanguage(language);
        return ChannelsMapper.INSTANCE.toDto(channelsRepository.findById(id)
                .orElseThrow(()-> new EntityNotFoundException(ResourceBundle.periodMessage(lang, "channelNotFound"))));
    }

    @Override
    public List<ChannelsDto> findAll() {
        return ChannelsMapper.INSTANCE.toDtos(channelsRepository.findAll());
    }




    /*
    This method returns all channels from db like interface MainChannelDbRequestInterface
    (should parse to MainChannelsResponse.class
    but add List<DiscountForMainChannelsDbRequestInterface> discountMinDaysResponses separately)
    */
    @Override
    public List<MainChannelDbRequestInterface> getChannelsWithoutDiscountsInterface(){
        List<MainChannelDbRequestInterface> channelRequestInterface = channelsRepository.getChannelsMain();
        return channelRequestInterface;
    }


    /*
    This method gets getChannelsWithoutDiscountsInterface and parses to MainChannelResponse
    also gets, parses and adds List<DiscountForMainChannelsDbRequestInterface> discountMinDaysResponses
     */
    @Override
    public List<MainChannelsResponse> getChannelsMain() {

        List<MainChannelDbRequestInterface> channelRespIntList = getChannelsWithoutDiscountsInterface();

        List<MainChannelsResponse> channelsResponseList=new ArrayList<>();

        for (MainChannelDbRequestInterface item:channelRespIntList) {
            MainChannelsResponse channelsResponse=new MainChannelsResponse();
            channelsResponse.setImage(item.getPhoto());
            channelsResponse.setId(item.getId());
            channelsResponse.setPrice(item.getPrice());
            channelsResponse.setName(item.getName());

            channelsResponse.setDiscountMinDaysResponses(discountsService.getDiscountForMainChannelsDbRequestInterface(item.getId()));
            channelsResponseList.add(channelsResponse);
        }

        return channelsResponseList;
    }
}
