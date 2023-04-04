package pl.klugeradoslaw.ex10architecture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.klugeradoslaw.ex10architecture.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
