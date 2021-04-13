package com.nvfredy.repository;

import com.nvfredy.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Query("select c from Customer c where c.name like '%' || :keyword || '%'" +
            "or c.email like '%' || :keyword || '%'" +
            "or c.address like '%' || :keyword || '%'")
    List<Customer> search(@Param("keyword") String keyword);
}
