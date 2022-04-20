package ru.gb.thymeleafprepare.dao;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ru.gb.thymeleafprepare.entity.Product;
import ru.gb.thymeleafprepare.entity.enums.Status;


import java.util.List;
import java.util.Optional;

public interface ProductDao extends JpaRepository<Product, Long> {
    List<Product> findAllByStatus(Status status);
    List<Product> findAllByStatus(Status status, Pageable pageable);
    List<Product> findAllByStatus(Status status, Sort sort);

    Optional<Product> findByTitle(String title);
    List<Product> findAllByTitleContaining(String title);

}
