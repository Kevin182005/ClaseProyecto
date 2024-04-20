package com.cibertec.prjdemo.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@Table(name = "Domicilio")
@AllArgsConstructor
@NoArgsConstructor

public class DomicilioEntity extends BaseEntity {
	

	private String name;	
	private int number;
	
	@ManyToOne
	@JoinColumn(name =" id_localidad")
	private LocalidadEntity localidad;

}
