package com.haidar.employeeservice.service;

import com.haidar.employeeservice.dto.EmployeeAddressDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@FeignClient(name = "ADDRESS-SERVICE")
public interface EmpAddressService {
    @GetMapping("api/addresses/{id}")
    List<EmployeeAddressDto> getAddressByEmpId(@PathVariable Long id);
}
