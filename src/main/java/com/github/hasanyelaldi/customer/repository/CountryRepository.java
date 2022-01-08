package com.github.hasanyelaldi.customer.repository;

import com.github.hasanyelaldi.customer.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}