package com.haidar.addressservice.mapper;

import com.haidar.addressservice.dto.EmployeeAddressDto;
import com.haidar.addressservice.entity.EmployeeAddressEntity;

public class EmpAddMapper {

    public static EmployeeAddressEntity mapToEntity(EmployeeAddressDto employeeAddressDto){
        return new EmployeeAddressEntity(
                employeeAddressDto.getId(),
                employeeAddressDto.getLine1(),
                employeeAddressDto.getLine2(),
                employeeAddressDto.getCity(),
                employeeAddressDto.getZipCode(),
                employeeAddressDto.getEmpId()
        );
    }

    public static EmployeeAddressDto mapToDto(EmployeeAddressEntity entity){
        return new EmployeeAddressDto(
                entity.getId(),
                entity.getLine1(),
                entity.getLine2(),
                entity.getCity(),
                entity.getZipCode(),
                entity.getEmpId()
        );
    }
}
