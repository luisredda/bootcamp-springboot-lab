package com.officesupply.api.controller;

import com.officesupply.api.model.OfficeSupply;
import com.officesupply.api.service.OfficeSupplyService;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/supplies")
public class OfficeSupplyController {

    private final OfficeSupplyService service;

    public OfficeSupplyController(OfficeSupplyService service) {
        this.service = service;
    }

    // GET /api/supplies?page=0
    @GetMapping
    public ResponseEntity<Page<OfficeSupply>> getAllSupplies(
            @RequestParam(defaultValue = "0") int page) {
        return ResponseEntity.ok(service.getAllSupplies(page));
    }

    // GET /api/supplies/{id}
    @GetMapping("/{id}")
    public ResponseEntity<OfficeSupply> getSupplyById(@PathVariable Long id) {
        return service.getSupplyById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // GET /api/supplies/category/{category}?page=0
    @GetMapping("/category/{category}")
    public ResponseEntity<Page<OfficeSupply>> getSuppliesByCategory(
            @PathVariable String category,
            @RequestParam(defaultValue = "0") int page) {
        return ResponseEntity.ok(service.getSuppliesByCategory(category, page));
    }

    // GET /api/supplies/search?name=pen&page=0
    @GetMapping("/search")
    public ResponseEntity<Page<OfficeSupply>> searchSupplies(
            @RequestParam String name,
            @RequestParam(defaultValue = "0") int page) {
        return ResponseEntity.ok(service.searchSuppliesByName(name, page));
    }
}
