package com.cibertec.prjdemo.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "Persona")
@AllArgsConstructor
@NoArgsConstructor


public class PersonaEntity extends BaseEntity{
	
    @Column(columnDefinition="CHAR(20)", nullable = false)
	private String name;
    @Column (name="lastname")
    private String lastname;
    private String dni;
    
    @OneToOne(cascade = CascadeType.ALL)
    private DomicilioEntity domicilio;
    
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinTable(name= "personna_libro",
    
    		joinColumns = @JoinColumn(name="persona_id"),
    		inverseJoinColumns= @JoinColumn(name="libro_id")
    )
    private List<LibroEntity> libros = new ArrayList<LibroEntity>();
    	


}
