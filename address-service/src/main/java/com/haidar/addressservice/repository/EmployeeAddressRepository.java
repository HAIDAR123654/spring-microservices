package com.haidar.addressservice.repository;

import com.haidar.addressservice.entity.EmployeeAddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeAddressRepository extends JpaRepository<EmployeeAddressEntity, Long> {
    @Query("SELECT a FROM EmployeeAddressEntity a where a.empId=:id")
    List<EmployeeAddressEntity> findAllEmpById(Long id);
}
