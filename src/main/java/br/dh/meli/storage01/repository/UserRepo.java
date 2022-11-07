package br.dh.meli.storage01.repository;

import br.dh.meli.storage01.model.UserBD;
import org.springframework.data.repository.CrudRepository;

// CRUD = create, read, update and delete
// aqui no <UserBD, Long> é especificado a classe e a chave primária(deve ser em classe, ou seja, o 'L' aqui é maiúsculo)
public interface UserRepo extends CrudRepository<UserBD, Long> {

}
