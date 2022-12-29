package kg.mega.naTV.models.mappers;

import kg.mega.NaTV.models.dtos.OrdersDto;
import kg.mega.NaTV.models.entities.Orders;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrdersMapper extends BaseMapper<Orders, OrdersDto>{

    OrdersMapper INSTANCE = Mappers.getMapper(OrdersMapper.class);
}
