package pl.klugeradoslaw.ex10architecture.service;

import org.springframework.stereotype.Service;
import pl.klugeradoslaw.ex10architecture.entity.JobOfferDtoMapper;
import pl.klugeradoslaw.ex10architecture.repository.JobOfferRepository;
import pl.klugeradoslaw.ex10architecture.entity.dto.JobOfferDto;

import java.util.Optional;

@Service
public class JobOfferService {
    private JobOfferRepository jobOfferRepository;
    private JobOfferDtoMapper jobOfferDtoMapper;

    public JobOfferService(JobOfferRepository jobOfferRepository, JobOfferDtoMapper jobOfferDtoMapper) {
        this.jobOfferRepository = jobOfferRepository;
        this.jobOfferDtoMapper = jobOfferDtoMapper;
    }

    public Optional<JobOfferDto> getOfferById(Long id) {
            return jobOfferRepository.findById(id).map(jobOfferDtoMapper::map);
        }
    }
