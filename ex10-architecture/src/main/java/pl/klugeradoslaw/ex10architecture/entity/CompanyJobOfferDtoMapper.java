package pl.klugeradoslaw.ex10architecture.entity;

import org.springframework.stereotype.Service;
import pl.klugeradoslaw.ex10architecture.entity.JobOffer;
import pl.klugeradoslaw.ex10architecture.entity.dto.CompanyJobOfferDto;

@Service
public class CompanyJobOfferDtoMapper {
    public CompanyJobOfferDto map(JobOffer jobOffer) {
        CompanyJobOfferDto dto = new CompanyJobOfferDto();
        dto.setId(jobOffer.getId());
        dto.setTitle(jobOffer.getTitle());
        dto.setLocation(jobOffer.getLocation());
        dto.setMinSalary(jobOffer.getMinSalary());
        dto.setMaxSalary(jobOffer.getMaxSalary());
        return dto;
    }

}
