package ccom.web.tornase.SpringWeb.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
       
@Entity
@Table(name = "login")
public class JA {
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
    
      @Column(name = "nome", length = 100, nullable = false)
      private String nome;
    
      @Column(name = "email", length = 180, nullable = false)
      private String email;
    
      @Column(name = "senha", length = 255, nullable = false)
      private String senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
