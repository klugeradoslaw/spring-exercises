package pl.klugeradoslaw.ex11apifoodieapp.order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
