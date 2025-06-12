package br.unicap.si.poo.project.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @GetMapping("/")
    public String hello() {
        return "✅ API do Projeto de PI3 está rodando com sucesso!";
    }
}
