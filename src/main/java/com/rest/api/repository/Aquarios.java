package com.rest.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.api.model.Aquario;

public interface Aquarios extends JpaRepository<Aquario, Long> {
	
	public Aquario findById(Long codigo);
	
}
