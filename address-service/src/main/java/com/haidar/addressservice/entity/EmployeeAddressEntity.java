package com.haidar.addressservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "addresses")
public class EmployeeAddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 100)
    private String line1;
    private String line2;
    @Column(nullable = false, length = 20)
    private String city;
    @Column(nullable = false, length = 6)
    private Long zipCode;
    @Column(nullable = false, length = 100)
    private Long empId;
}
