package com.officesupply.api.repository;

import com.officesupply.api.model.OfficeSupply;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfficeSupplyRepository extends JpaRepository<OfficeSupply, Long> {

    Page<OfficeSupply> findByCategory(String category, Pageable pageable);

    Page<OfficeSupply> findByNameContainingIgnoreCase(String name, Pageable pageable);
}
