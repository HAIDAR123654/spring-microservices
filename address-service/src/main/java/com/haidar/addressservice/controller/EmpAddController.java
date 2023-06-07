package com.haidar.addressservice.controller;

import com.haidar.addressservice.dto.EmployeeAddressDto;
import com.haidar.addressservice.service.EmpAddSerImpl.EmployeeAddressService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "api/addresses")
public class EmpAddController {

    private EmployeeAddressService employeeAddressService;

    @PostMapping("{id}")
    public ResponseEntity<EmployeeAddressDto> saveAddress(@PathVariable Long id, @RequestBody EmployeeAddressDto employeeAddressDto){
        EmployeeAddressDto savedEmp = employeeAddressService.createAddress(id, employeeAddressDto);
        return new ResponseEntity<>(savedEmp, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<List<EmployeeAddressDto>> getAddressByEmpId(@PathVariable Long id){
        List<EmployeeAddressDto> empDto = employeeAddressService.getAddByEmpId(id);
        return new ResponseEntity<>(empDto, HttpStatus.OK);
    }

}
