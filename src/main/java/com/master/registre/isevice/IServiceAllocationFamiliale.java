package com.master.registre.isevice;

import org.springframework.data.jpa.repository.JpaRepository;

import com.master.registre.entity.AllocationFamiliale;

public interface IServiceAllocationFamiliale extends JpaRepository<AllocationFamiliale, Integer> {

}
