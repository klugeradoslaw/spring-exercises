package pl.klugeradoslaw.ex10architecture.entity;

import org.springframework.stereotype.Service;
import pl.klugeradoslaw.ex10architecture.entity.JobOffer;
import pl.klugeradoslaw.ex10architecture.entity.dto.JobOfferDto;

@Service
public class JobOfferDtoMapper {
    public JobOfferDto map(JobOffer jobOffer) {
        JobOfferDto dto = new JobOfferDto();
        dto.setId(jobOffer.getId());
        dto.setTitle(jobOffer.getTitle());
        dto.setDescription(jobOffer.getDescription());
        dto.setRequirements(jobOffer.getRequirements());
        dto.setDuties(jobOffer.getDuties());
        dto.setLocation(jobOffer.getLocation());
        dto.setMinSalary(jobOffer.getMinSalary());
        dto.setMaxSalary(jobOffer.getMaxSalary());
        dto.setDateAdded(jobOffer.getDateAdded());
        dto.setCompanyId(jobOffer.getCompany().getId());
        dto.setCompanyName(jobOffer.getCompany().getName());
        return dto;
    }
}
