package pl.klugeradoslaw.ex10architecture.service;

import org.springframework.stereotype.Service;
import pl.klugeradoslaw.ex10architecture.repository.CompanyRepository;
import pl.klugeradoslaw.ex10architecture.entity.Company;
import pl.klugeradoslaw.ex10architecture.entity.CompanyDtoMapper;
import pl.klugeradoslaw.ex10architecture.entity.CompanyJobOfferDtoMapper;
import pl.klugeradoslaw.ex10architecture.entity.dto.CompanyDto;
import pl.klugeradoslaw.ex10architecture.entity.dto.CompanyJobOfferDto;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class CompanyService {
    private final CompanyRepository companyRepository;
    private final CompanyDtoMapper companyDtoMapper;
    private final CompanyJobOfferDtoMapper companyJobOfferDtoMapper;

    public CompanyService(CompanyRepository companyRepository, CompanyDtoMapper companyDtoMapper, CompanyJobOfferDtoMapper companyJobOfferDtoMapper) {
        this.companyRepository = companyRepository;
        this.companyDtoMapper = companyDtoMapper;
        this.companyJobOfferDtoMapper = companyJobOfferDtoMapper;
    }

    public Optional<CompanyDto> getCompanyById(Long id) {
        return companyRepository.findById(id).map(companyDtoMapper::map);
    }

    public List<CompanyJobOfferDto> getJobOffersByCompanyId(Long companyId) {
        return companyRepository.findById(companyId)
                .map(Company::getJobOffersList)
                .orElse(Collections.emptyList())
                .stream()
                .map(companyJobOfferDtoMapper::map)
                .toList();
    }
}
