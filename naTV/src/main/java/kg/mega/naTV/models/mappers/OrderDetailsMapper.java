package kg.mega.naTV.models.mappers;

import kg.mega.NaTV.models.dtos.OrderDetailsDto;
import kg.mega.NaTV.models.entities.OrderDetails;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderDetailsMapper extends BaseMapper<OrderDetails, OrderDetailsDto>{

    OrderDetailsMapper INSTANCE = Mappers.getMapper(OrderDetailsMapper.class);
}
