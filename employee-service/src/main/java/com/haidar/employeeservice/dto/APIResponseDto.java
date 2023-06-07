package com.haidar.employeeservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class APIResponseDto {

    private EmployeeDto employee;
    private DepartmentDto department;
    private OrganizationDto organization;
    private List<EmployeeAddressDto> addressDtoList;
}
