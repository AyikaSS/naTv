package kg.mega.naTV.repositories;

import kg.mega.NaTV.models.entities.Days;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaysRepository extends JpaRepository<Days, Long> {

}
