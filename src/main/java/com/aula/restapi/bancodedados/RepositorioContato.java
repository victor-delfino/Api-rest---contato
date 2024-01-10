package com.aula.restapi.bancodedados;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aula.restapi.entidade.Contato;

public interface RepositorioContato extends  JpaRepository<Contato,Long> { 
    
}
