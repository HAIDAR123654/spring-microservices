package com.haidar.employeeservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeAddressDto {
    private Long id;
    private String line1;
    private String line2;
    private String city;
    private Long zipCode;
    private Long empId;
}
