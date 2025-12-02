package sweetBookiBackend.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sweetBookiBackend.model.entity.BookEditions;

@Repository
public interface BookEditionRepository extends JpaRepository<BookEditions, Long> {
}
