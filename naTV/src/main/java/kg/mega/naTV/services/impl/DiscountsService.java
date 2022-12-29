package kg.mega.naTV.services.impl;

import kg.mega.NaTV.exceptions.EntityNotFoundException;
import kg.mega.NaTV.models.dtos.DiscountsDto;
import kg.mega.NaTV.models.mappers.DiscountsMapper;
import kg.mega.NaTV.models.dbRequests.DiscountForMainChannelsDbRequestInterface;
import kg.mega.NaTV.repositories.DiscountsRepository;
import kg.mega.NaTV.services.DiscountsService;
import kg.mega.NaTV.utils.ResourceBundle;
import kg.mega.NaTV.utils.models.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscountsService implements DiscountsService {

    private final DiscountsRepository repository;

    @Autowired
    public DiscountsService(DiscountsRepository repository) {
        this.repository = repository;
    }

    @Override
    public DiscountsDto save(DiscountsDto discountsDto) {
        return DiscountsMapper.INSTANCE.toDto(repository.save(DiscountsMapper.INSTANCE.toEntity(discountsDto)));
    }

    @Override
    public DiscountsDto findById(Long id, int language) {
        Language lang = Language.getLanguage(language);
        return DiscountsMapper.INSTANCE.toDto(repository.findById(id)
                .orElseThrow(()-> new EntityNotFoundException(ResourceBundle.periodMessage(lang, "discountsNotFound"))));
    }

    @Override
    public List<DiscountsDto> findAll() {
        return DiscountsMapper.INSTANCE.toDtos(repository.findAll());
    }




    @Override
    public List<DiscountForMainChannelsDbRequestInterface> getDiscountForMainChannelsDbRequestInterface(Long channelId) {
        return repository.getDiscountByChannel(channelId);
    }
}
