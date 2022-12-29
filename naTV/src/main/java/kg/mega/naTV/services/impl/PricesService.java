package kg.mega.naTV.services.impl;

import kg.mega.NaTV.exceptions.EntityNotFoundException;
import kg.mega.NaTV.models.dtos.PricesDto;
import kg.mega.NaTV.models.entities.Prices;
import kg.mega.NaTV.models.mappers.PricesMapper;
import kg.mega.NaTV.repositories.PricesRepository;
import kg.mega.NaTV.services.PricesService;
import kg.mega.NaTV.utils.ResourceBundle;
import kg.mega.NaTV.utils.models.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PricesService implements kg.mega.naTV.services.PricesService {

    private final PricesRepository repository;

    @Autowired
    public PricesService(PricesRepository repository) {
        this.repository = repository;
    }

    @Override
    public PricesDto save(PricesDto pricesDto) {
        return PricesMapper.INSTANCE.toDto(repository.save(PricesMapper.INSTANCE.toEntity(pricesDto)));
    }

    @Override
    public PricesDto findById(Long id, int language) {
        Language lang = Language.getLanguage(language);
        return PricesMapper.INSTANCE.toDto(repository.findById(id)
                .orElseThrow(()-> new EntityNotFoundException(ResourceBundle.periodMessage(lang, "priceNotFound"))));
    }

    @Override
    public List<PricesDto> findAll() {
        return PricesMapper.INSTANCE.toDtos(repository.findAll());
    }
}
