package kg.mega.naTV.models.mappers;

import kg.mega.NaTV.models.dtos.DaysDto;
import kg.mega.NaTV.models.entities.Days;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DaysMapper extends BaseMapper<Days, DaysDto>{

    DaysMapper INSTANCE = Mappers.getMapper(DaysMapper.class);
}
