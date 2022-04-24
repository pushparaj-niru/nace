package com.nace.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nace.entity.NACEEntity;

public interface NACERepository extends JpaRepository<NACEEntity, Long> {
	
}
