package kg.mega.naTV.repositories;

import kg.mega.NaTV.models.entities.Channels;
import kg.mega.NaTV.models.dbRequests.MainChannelDbRequestInterface;
import kg.mega.naTV.models.entities.Channels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChannelsRepository extends JpaRepository<Channels, Long> {

    @Query(value = "SELECT c.id, c.name, c.photo, p.price FROM tb_channels c JOIN tb_prices p ON c.id = p.id_channels ",nativeQuery = true)
    List<MainChannelDbRequestInterface> getChannelsMain();

}
