package pl.klugeradoslaw.ex10architecture.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.klugeradoslaw.ex10architecture.service.JobOfferService;
import pl.klugeradoslaw.ex10architecture.entity.dto.JobOfferDto;

@RestController
public class JobOfferController {

    private final JobOfferService jobOfferService;

    public JobOfferController(JobOfferService jobOfferService) {
        this.jobOfferService = jobOfferService;
    }

    @GetMapping("/offers/{id}")
    ResponseEntity<JobOfferDto> getOfferById(@PathVariable Long id) {
         return jobOfferService.getOfferById(id)
                 .map(ResponseEntity::ok)
                 .orElse(ResponseEntity.notFound().build());
    }
}
