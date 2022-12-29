package kg.mega.naTV.models.mappers;

import kg.mega.NaTV.models.dtos.ChannelsDto;
import kg.mega.NaTV.models.entities.Channels;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ChannelsMapper extends BaseMapper<Channels, ChannelsDto>{

    ChannelsMapper INSTANCE = Mappers.getMapper(ChannelsMapper.class);
}
