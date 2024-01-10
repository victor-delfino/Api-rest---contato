package com.aula.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aula.restapi.bancodedados.RepositorioContato;
import com.aula.restapi.entidade.Contato;

@RestController
@RequestMapping("/contato")
public class ContatoREST {
    @Autowired 
    private RepositorioContato repositorio; // quero que vc cadastre o nome e a idade de 10 pessoas, mas elas não podem ter a idade maior que 50, caso contrário elas precisam receber a mensagem que vão bater as botas.

    /*  int idade[10];
    // string nome[10];

    // for(i = 0; i<10; i++){
        system.out.println("Escreva seu nome")
        console.log(idade[i])
        
    }
*/
    @GetMapping  
    public List<Contato>listar(){ 
        return repositorio.findAll();
    }
    @PostMapping
    public void salvar(@RequestBody Contato contato){
        repositorio.save(contato);
    }
    @PutMapping
    public void alterar(@RequestBody Contato contato){
        if(contato.getId()> 0)
        repositorio.save(contato);
    }
    @DeleteMapping
    public void deletar(@RequestBody Contato contato){
        repositorio.delete(contato);
    }

}
