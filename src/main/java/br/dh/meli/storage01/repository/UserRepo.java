package br.dh.meli.storage01.repository;

import br.dh.meli.storage01.model.UserBD;
import org.springframework.data.repository.CrudRepository;

// CRUD = create, read, update and delete
public class UserRepo extends CrudRepository<UserBD, Long> {

}
