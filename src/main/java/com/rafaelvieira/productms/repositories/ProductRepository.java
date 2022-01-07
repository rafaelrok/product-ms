package com.rafaelvieira.productms.repositories;

import com.rafaelvieira.productms.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query("FROM Product p " +
            "WHERE LOWER(p.name) like %:searching% " +
            "OR LOWER(p.description) like %:searching%")
    Page<Product> search(@Param("searching") String searching, Pageable pageable);
}
