package com.master.registre.isevice;

import org.springframework.data.jpa.repository.JpaRepository;

import com.master.registre.entity.Citoyen;

public interface IServiceCitoyen extends JpaRepository<Citoyen, Integer> {

}
