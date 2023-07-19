package com.example.medicinemanagerdemo.repository;

import com.example.medicinemanagerdemo.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<Login, Long> {
}
