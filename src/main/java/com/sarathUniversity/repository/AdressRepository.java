package com.sarathUniversity.repository;

import com.sarathUniversity.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdressRepository extends JpaRepository<Address, Long>
{
}
