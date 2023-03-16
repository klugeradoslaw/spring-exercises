package pl.klugeradoslaw.ex02crudapi.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.klugeradoslaw.ex02crudapi.models.User;

public interface UserRepo extends JpaRepository<User, Long> {
}
