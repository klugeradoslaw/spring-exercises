package pl.klugeradoslaw.ex10architecture.entity;

import org.springframework.stereotype.Service;
import pl.klugeradoslaw.ex10architecture.entity.Company;
import pl.klugeradoslaw.ex10architecture.entity.dto.CompanyDto;

@Service
public class CompanyDtoMapper {
    public CompanyDto map(Company company) {
        CompanyDto dto = new CompanyDto();
        dto.setId(company.getId());
        dto.setName(company.getName());
        dto.setDescription(company.getDescription());
        dto.setCity(company.getCity());
        dto.setEmployees(company.getEmployees());
        dto.setTelephone(company.getTelephone());
        dto.setEmail(company.getEmail());
        return dto;
    }
}
