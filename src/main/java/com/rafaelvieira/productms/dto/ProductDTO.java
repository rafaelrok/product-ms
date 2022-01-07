package com.rafaelvieira.productms.dto;

import com.rafaelvieira.productms.entities.Product;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.io.Serializable;

public class ProductDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    @NotNull
    @NotBlank(message = "Campo requirido")
    private String name;

    @NotNull
    @NotBlank(message = "Campo requirido")
    private String description;

    @NotNull
    @Positive(message = "Preço deve ser positivo")
    private Double price;

    public ProductDTO() {
    }

    public ProductDTO(Long id, String name, String description, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public ProductDTO(Product entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.description = entity.getDescription();
        this.price = entity.getPrice();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
