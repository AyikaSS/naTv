package kg.mega.naTV.services.impl;

import kg.mega.NaTV.exceptions.EntityNotFoundException;
import kg.mega.NaTV.models.dtos.OrdersDto;
import kg.mega.NaTV.models.entities.Orders;
import kg.mega.NaTV.models.mappers.OrdersMapper;
import kg.mega.NaTV.repositories.OrdersRepository;
import kg.mega.NaTV.services.OrdersService;
import kg.mega.NaTV.utils.ResourceBundle;
import kg.mega.NaTV.utils.models.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService implements OrdersService {

    private final OrdersRepository repository;

    @Autowired
    public OrdersService(OrdersRepository repository) {
        this.repository = repository;
    }

    @Override
    public OrdersDto save(OrdersDto ordersDto) {
        return OrdersMapper.INSTANCE.toDto(repository.save(OrdersMapper.INSTANCE.toEntity(ordersDto)));
    }

    @Override
    public OrdersDto findById(Long id, int language) {
        Language lang = Language.getLanguage(language);
        return OrdersMapper.INSTANCE.toDto(repository.findById(id)
                .orElseThrow(()-> new EntityNotFoundException(ResourceBundle.periodMessage(lang, "ordersNotFound"))));
    }

    @Override
    public List<OrdersDto> findAll() {
        return OrdersMapper.INSTANCE.toDtos(repository.findAll());
    }
}
