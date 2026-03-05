package com.officesupply.api.service;

import com.officesupply.api.model.OfficeSupply;
import com.officesupply.api.repository.OfficeSupplyRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OfficeSupplyService {

    private static final int PAGE_SIZE = 15;

    private final OfficeSupplyRepository repository;

    public OfficeSupplyService(OfficeSupplyRepository repository) {
        this.repository = repository;
    }

    public Page<OfficeSupply> getAllSupplies(int page) {
        Pageable pageable = PageRequest.of(page, PAGE_SIZE, Sort.by("id").ascending());
        return repository.findAll(pageable);
    }

    public Optional<OfficeSupply> getSupplyById(Long id) {
        return repository.findById(id);
    }

    public Page<OfficeSupply> getSuppliesByCategory(String category, int page) {
        Pageable pageable = PageRequest.of(page, PAGE_SIZE, Sort.by("name").ascending());
        return repository.findByCategory(category, pageable);
    }

    public Page<OfficeSupply> searchSuppliesByName(String name, int page) {
        Pageable pageable = PageRequest.of(page, PAGE_SIZE, Sort.by("name").ascending());
        return repository.findByNameContainingIgnoreCase(name, pageable);
    }
}
