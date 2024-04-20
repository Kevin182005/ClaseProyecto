package com.cibertec.prjdemo.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.cibertec.prjdemo.entities.BaseEntity;

@NoRepositoryBean
public interface IBaseRepository <E extends BaseEntity, ID extends Serializable > extends JpaRepository<E, ID> {
	

}
