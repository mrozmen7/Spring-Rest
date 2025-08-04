package com.ozmenyavuz.repository;

import com.ozmenyavuz.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Locale;
import java.util.Optional;
import java.util.UUID;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {

    Optional<CustomerEntity> findByEmail(String email);

    boolean existsByEmail(String email); // ayni email kayitli mi
    boolean existsByNationalId(String nationalId); //
}
