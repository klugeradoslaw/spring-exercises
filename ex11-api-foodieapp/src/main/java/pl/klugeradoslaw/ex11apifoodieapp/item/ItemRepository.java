package pl.klugeradoslaw.ex11apifoodieapp.item;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
