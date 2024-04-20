package com.cibertec.prjdemo.repositories;



import org.springframework.stereotype.Repository;

import com.cibertec.prjdemo.entities.PersonaEntity;

@Repository
public interface IPersonaRepository extends IBaseRepository<PersonaEntity, Long> {


}
