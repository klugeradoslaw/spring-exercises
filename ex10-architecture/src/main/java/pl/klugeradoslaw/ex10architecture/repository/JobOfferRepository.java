package pl.klugeradoslaw.ex10architecture.repository;

import org.springframework.data.repository.CrudRepository;
import pl.klugeradoslaw.ex10architecture.entity.JobOffer;

public interface JobOfferRepository extends CrudRepository<JobOffer, Long> {
}
