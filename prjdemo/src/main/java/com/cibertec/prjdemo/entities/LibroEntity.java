package com.cibertec.prjdemo.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@Table(name = "Libro")
@AllArgsConstructor
@NoArgsConstructor

public class LibroEntity extends BaseEntity {
	
    @Column(columnDefinition="CHAR(20)", nullable = false)
	private String name;
    private String gender;
    private int pages ;
	
	@ManyToMany(cascade = CascadeType.REFRESH)
	private List<AutorEntity>autores;
	

}
