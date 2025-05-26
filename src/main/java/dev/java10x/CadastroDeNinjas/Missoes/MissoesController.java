package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

//LOCALHOST:8080
@RestController
@RequestMapping("missoes")
public class MissoesController {

//    GET -- Mandar uma requisicao para mostrar as missoes
    @GetMapping("/listar")
    public String listarMissao() {
        return "Missoes listada com sucesso";
    }

//    POST -- Mandar uma requisicao para criar as missoes
    @PostMapping("/criar")
    public String criarMissao() {
        return "Missao criada com sucesso";
    }

//    PUT -- Mandar uma requisicao para alterar as missoes
    @PutMapping("/alterar")
    public String alterarMissao() {
        return "Missao alterada com sucesso";
    }

//    DELETE -- Mandar uma requisicao para deletar as missoes
    @DeleteMapping("/deletar")
    public String deletarMissao() {
        return "Missao deletada com sucesso";
    }

    
}
