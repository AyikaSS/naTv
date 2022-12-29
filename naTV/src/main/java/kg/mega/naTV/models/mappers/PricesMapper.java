package kg.mega.naTV.models.mappers;

import kg.mega.NaTV.models.dtos.PricesDto;
import kg.mega.NaTV.models.entities.Prices;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PricesMapper extends BaseMapper<Prices, PricesDto>{

    PricesMapper INSTANCE = Mappers.getMapper(PricesMapper.class);
}
