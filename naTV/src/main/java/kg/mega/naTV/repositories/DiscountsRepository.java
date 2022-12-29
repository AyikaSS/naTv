package kg.mega.naTV.repositories;

import kg.mega.NaTV.models.entities.Discounts;
import kg.mega.NaTV.models.dbRequests.DiscountForMainChannelsDbRequestInterface;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiscountsRepository extends JpaRepository<Discounts, Long> {

    @Query(value = "select d.min_days as minDays, d.percent from tb_discounts d where d.id_channels=?1",nativeQuery = true)
    List<DiscountForMainChannelsDbRequestInterface> getDiscountByChannel(Long channelId);
}
