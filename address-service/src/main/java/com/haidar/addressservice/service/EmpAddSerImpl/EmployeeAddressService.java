package com.haidar.addressservice.service.EmpAddSerImpl;

import com.haidar.addressservice.dto.EmployeeAddressDto;
import com.haidar.addressservice.entity.EmployeeAddressEntity;
import com.haidar.addressservice.mapper.EmpAddMapper;
import com.haidar.addressservice.repository.EmployeeAddressRepository;
import com.haidar.addressservice.service.EmpAddService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor
public class EmployeeAddressService implements EmpAddService {

    private EmployeeAddressRepository employeeAddressRepository;
    @Override
    public EmployeeAddressDto createAddress(Long id, EmployeeAddressDto employeeAddressDto) {
        EmployeeAddressEntity entity = EmpAddMapper.mapToEntity(employeeAddressDto);
        entity.setEmpId(id);
        EmployeeAddressEntity savedEmpAddEntity = employeeAddressRepository.save(entity);
        return EmpAddMapper.mapToDto(savedEmpAddEntity);
    }

    @Override
    public List<EmployeeAddressDto> getAddByEmpId(Long id) {
        List<EmployeeAddressEntity> allEmp = employeeAddressRepository.findAllEmpById(id);
        return allEmp.stream().map(EmpAddMapper::mapToDto).collect(Collectors.toList());
    }
}
