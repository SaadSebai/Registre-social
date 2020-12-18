package com.master.registre.isevice;

import org.springframework.data.jpa.repository.JpaRepository;

import com.master.registre.entity.Employee;

public interface IService extends JpaRepository<Employee, Long> {

}
