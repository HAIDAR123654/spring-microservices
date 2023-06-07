package com.haidar.departmentservice.service.impl;

import com.haidar.departmentservice.dto.DepartmentDto;
import com.haidar.departmentservice.entity.Department;
import com.haidar.departmentservice.mapper.DepartmentMapper;
import com.haidar.departmentservice.repository.DepartmentRepository;
import com.haidar.departmentservice.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;
    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {

        Department department = DepartmentMapper.mapToDepartment(departmentDto);
        Department savedDepartment = departmentRepository.save(department);
        return DepartmentMapper.mapToDepartmentDto(savedDepartment);
    }

    @Override
    public DepartmentDto getDepartmentByCode(String departmentCode) {
        Department department = departmentRepository.findByDepartmentCode(departmentCode);
        return DepartmentMapper.mapToDepartmentDto(department);
    }
}
