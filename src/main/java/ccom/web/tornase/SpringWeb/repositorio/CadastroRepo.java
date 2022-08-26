package ccom.web.tornase.SpringWeb.repositorio;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import ccom.web.tornase.SpringWeb.models.Cadastrar;

public interface CadastroRepo extends CrudRepository<Cadastrar, Integer> {
    @Query(value="select CASE WHEN count(1) > 0 THEN 'true' ELSE 'false' END  from itens where id = :id", nativeQuery = true)
     public boolean exist(int id);
}
