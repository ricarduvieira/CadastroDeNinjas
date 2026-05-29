package com.Java10x.CadastroDeNinjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {


    @GetMapping("/boasvindas")
    public String boasVinda(){
        return "Essa é minha prieira mensagem nesta rota";
    }

}
