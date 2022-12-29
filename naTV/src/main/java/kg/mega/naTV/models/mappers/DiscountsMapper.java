package kg.mega.naTV.models.mappers;

import kg.mega.NaTV.models.dtos.DiscountsDto;
import kg.mega.NaTV.models.entities.Discounts;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DiscountsMapper extends BaseMapper<Discounts, DiscountsDto>{

    DiscountsMapper INSTANCE = Mappers.getMapper(DiscountsMapper.class);
}
