package ccom.web.tornase.SpringWeb.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import ccom.web.tornase.SpringWeb.models.Cadastrar;


import ccom.web.tornase.SpringWeb.repositorio.CadastroRepo;

@Controller
public class CadastroController {

    @Autowired
    private CadastroRepo repo;

    @GetMapping("/cadastro")
    public String index(Model model){
        java.util.List<Cadastrar> cadastro = (java.util.List<Cadastrar>)repo.findAll();
        model.addAttribute("cadastro", cadastro);
        return "cadastro/index";
    } 

    @GetMapping("/cadastro/novo")
    public String novo(){
        return "cadastro/novo";
    } 

    @PostMapping("/cadastro/criar")
    public String criar(Cadastrar cadastrar){
        repo.save(cadastrar);
        return "redirect:/cadastro";
    } 

    @GetMapping("/cadastro/{id}")
    public String busca(@PathVariable int id, Model model ){
        Optional<Cadastrar> edit = repo.findById(id);
       try {
           model.addAttribute("cadastro", edit.get());        
        }
        catch (Exception err) {return "redirect:/Cadastrar";}

        return "/cadastro/editar";
    } 

    @PostMapping("/administradores/{id}/atualizar")
    public String atualizar(@PathVariable int id, Cadastrar cadastrar){
      // if(!repo.exist(id)){
      if(!repo.existsById(id)){
        return "redirect:/cadastro";
      }
  
      repo.save(cadastrar);
  
      return "redirect:/cadastro";
    }
        
    @GetMapping("/cadastro/{id}/excluir")
    public String excluir(@PathVariable int id ){
        repo.deleteById(id);
        return "redirect:/cadastro";
    } 
    
}
