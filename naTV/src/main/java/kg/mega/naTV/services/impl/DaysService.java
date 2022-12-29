package kg.mega.naTV.services.impl;

import kg.mega.NaTV.exceptions.EntityNotFoundException;
import kg.mega.NaTV.models.dtos.DaysDto;
import kg.mega.NaTV.models.entities.Days;
import kg.mega.NaTV.models.mappers.DaysMapper;
import kg.mega.NaTV.repositories.DaysRepository;
import kg.mega.NaTV.services.DaysService;
import kg.mega.NaTV.utils.ResourceBundle;
import kg.mega.NaTV.utils.models.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DaysService implements DaysService {

    private final DaysRepository repository;

    @Autowired
    public DaysService(DaysRepository repository) {
        this.repository = repository;
    }

    @Override
    public DaysDto save(DaysDto daysDto) {
        return DaysMapper.INSTANCE.toDto(repository.save(DaysMapper.INSTANCE.toEntity(daysDto)));
    }

    @Override
    public DaysDto findById(Long id, int language) {
        Language lang = Language.getLanguage(language);
        return DaysMapper.INSTANCE.toDto(repository.findById(id)
                .orElseThrow(()-> new EntityNotFoundException(ResourceBundle.periodMessage(lang, "daysNotFound"))));
    }

    @Override
    public List<DaysDto> findAll() {
        return DaysMapper.INSTANCE.toDtos(repository.findAll());
    }
}
