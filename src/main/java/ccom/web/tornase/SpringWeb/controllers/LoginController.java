package ccom.web.tornase.SpringWeb.controllers;

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
    public String logar(Model model, JA log, String lembrar ){
        boolean loc = this.repo.login(log.getEmail(), log.getSenha());
        if(loc = null != null){
            return "redirect:/";
        }
        model.addAttribute("erro","Usuario ou senha inválidos" );
        return "home/index";
    }
    
}
