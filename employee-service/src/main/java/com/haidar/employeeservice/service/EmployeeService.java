package com.haidar.employeeservice.service;

import com.haidar.employeeservice.dto.APIResponseDto;
import com.haidar.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);
    APIResponseDto getEmployeeById(Long employeeId);

}
