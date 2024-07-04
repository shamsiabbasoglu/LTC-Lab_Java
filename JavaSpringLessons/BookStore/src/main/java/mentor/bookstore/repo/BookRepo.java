package mentor.bookstore.repo;



import mentor.bookstore.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepo extends JpaRepository<BookEntity, Long> {
    List<BookEntity> findByAuthor(String author);
}
