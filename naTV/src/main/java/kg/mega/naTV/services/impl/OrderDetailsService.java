package kg.mega.naTV.services.impl;

import kg.mega.NaTV.exceptions.EntityNotFoundException;
import kg.mega.NaTV.models.dtos.OrderDetailsDto;
import kg.mega.NaTV.models.entities.OrderDetails;
import kg.mega.NaTV.models.mappers.OrderDetailsMapper;
import kg.mega.NaTV.repositories.OrderDetailsRepository;
import kg.mega.NaTV.services.OrderDetailsService;
import kg.mega.NaTV.utils.ResourceBundle;
import kg.mega.NaTV.utils.models.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailsService implements OrderDetailsService {

    private final OrderDetailsRepository repository;

    @Autowired
    public OrderDetailsService(OrderDetailsRepository repository) {
        this.repository = repository;
    }

    @Override
    public OrderDetailsDto save(OrderDetailsDto orderDetailsDto) {
        return OrderDetailsMapper.INSTANCE.toDto(repository.save(OrderDetailsMapper.INSTANCE.toEntity(orderDetailsDto)));
    }

    @Override
    public OrderDetailsDto findById(Long id, int language) {
        Language lang = Language.getLanguage(language);
        return OrderDetailsMapper.INSTANCE.toDto(repository.findById(id)
                .orElseThrow(()-> new EntityNotFoundException(ResourceBundle.periodMessage(lang, "orderDetailsNotFound"))));
    }

    @Override
    public List<OrderDetailsDto> findAll() {
        return OrderDetailsMapper.INSTANCE.toDtos(repository.findAll());
    }
}
