package com.ferkan.repostory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ferkan.entites.Home;

@Repository
public interface HomeRepostory extends JpaRepository<Home, Long> {

}
