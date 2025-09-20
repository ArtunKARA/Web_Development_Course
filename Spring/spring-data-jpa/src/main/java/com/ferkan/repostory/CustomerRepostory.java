package com.ferkan.repostory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ferkan.entites.Customer;

@Repository
public interface CustomerRepostory extends JpaRepository<Customer, Long>{

}
