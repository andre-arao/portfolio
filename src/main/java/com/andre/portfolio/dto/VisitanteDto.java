package com.andre.portfolio.dto;

import com.andre.portfolio.model.Topico;
import com.andre.portfolio.model.Visitante;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VisitanteDto {

    private String id;
    private String nome;
    private String email;
    private Topico topico;

    public Visitante toVisitante() {
        Visitante visitante = new Visitante();
        visitante.setNome(nome);
        visitante.setEmail(email);
        visitante.setTopico(topico);
        return visitante;
    }

}
