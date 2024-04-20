package com.cibertec.prjdemo.entities;


import jakarta.persistence.Entity;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "Localidad")
@AllArgsConstructor
@NoArgsConstructor
public class LocalidadEntity extends BaseEntity {

	private String name;

	

		
	}