package ccom.web.tornase.SpringWeb.repositorio;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import ccom.web.tornase.SpringWeb.models.JA;

public interface UsuarioRepo extends CrudRepository<JA, Integer>{
    @Query(value="select * from usuario1 where email = :email and senha = :senha", nativeQuery = true)
    public boolean login(String email, String senha);
}
