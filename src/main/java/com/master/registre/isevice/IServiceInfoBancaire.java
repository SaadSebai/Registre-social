package com.master.registre.isevice;

import org.springframework.data.jpa.repository.JpaRepository;

import com.master.registre.entity.InfoBancaire;

public interface IServiceInfoBancaire extends JpaRepository<InfoBancaire, Integer> {

}
