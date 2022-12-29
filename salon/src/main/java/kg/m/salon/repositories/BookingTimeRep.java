package kg.m.salon.repositories;

import kg.m.salon.models.entities.BookingTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingTimeRep extends JpaRepository<BookingTime,Long> {

}
