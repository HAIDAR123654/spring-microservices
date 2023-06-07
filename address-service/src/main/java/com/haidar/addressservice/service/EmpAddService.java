package com.haidar.addressservice.service;

import com.haidar.addressservice.dto.EmployeeAddressDto;

import java.util.List;


public interface EmpAddService {
    EmployeeAddressDto createAddress(Long id, EmployeeAddressDto employeeAddressDto);
    List<EmployeeAddressDto> getAddByEmpId(Long id);
}
