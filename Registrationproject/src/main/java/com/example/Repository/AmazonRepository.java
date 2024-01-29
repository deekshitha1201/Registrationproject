package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.AmazonRegister;

public interface AmazonRepository extends JpaRepository<AmazonRegister, Long> {

}
