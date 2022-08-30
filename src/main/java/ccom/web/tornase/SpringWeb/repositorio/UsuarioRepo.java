package ccom.web.tornase.SpringWeb.repositorio;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import ccom.web.tornase.SpringWeb.models.JA;

public interface UsuarioRepo extends CrudRepository<JA, Integer>{

    @Query(value="select * from usuario1 where email = :email and senha = :senha", nativeQuery = true)
    public JA Login(@Param("email") String email, @Param("senha") String senha);

}
