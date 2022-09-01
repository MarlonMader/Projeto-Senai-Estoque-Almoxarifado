package ccom.web.tornase.SpringWeb.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import ccom.web.tornase.SpringWeb.models.JA;
import ccom.web.tornase.SpringWeb.repositorio.UsuarioRepo;

@Controller
public class LoginController {

    @Autowired
    private UsuarioRepo repo;

    @GetMapping("/login")
    public String index(){
      return "login/index";
    }


    @PostMapping("/logar")
    public String logar(Model model, JA jaParam, String lembrar ){
      JA ja = this.repo.Login(jaParam.getEmail(), jaParam.getSenha());
      if(ja != null){
        return "redirect:/";
      }
      model.addAttribute("erro", "Usuário ou senha inválido" );
        return "login/index";
    }

    @GetMapping("/sair")
    public String logar(){
      return "redirect:/login";
    }
    
}
