package com.ferkan.repostory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ferkan.entites.Address;


@Repository
public interface AddressRepostory extends JpaRepository<Address, Long> {

}
