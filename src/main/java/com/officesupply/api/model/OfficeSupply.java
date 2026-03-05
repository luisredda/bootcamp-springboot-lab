package com.officesupply.api.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "office_supplies")
public class OfficeSupply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(length = 500)
    private String description;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal price;

    @Column(nullable = false)
    private Integer stockQuantity;

    @Column(nullable = false)
    private String sku;

    private String brand;

    public OfficeSupply() {}

    public OfficeSupply(String name, String category, String description,
                        BigDecimal price, Integer stockQuantity, String sku, String brand) {
        this.name = name;
        this.category = category;
        this.description = description;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.sku = sku;
        this.brand = brand;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public BigDecimal getPrice() { return price; }
    public void setPrice(BigDecimal price) { this.price = price; }

    public Integer getStockQuantity() { return stockQuantity; }
    public void setStockQuantity(Integer stockQuantity) { this.stockQuantity = stockQuantity; }

    public String getSku() { return sku; }
    public void setSku(String sku) { this.sku = sku; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }
}
