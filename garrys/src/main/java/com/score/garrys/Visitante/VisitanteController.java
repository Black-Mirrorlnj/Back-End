package com.score.gmod;

import java.util.List;

class VisitanteController {

    VisitanteService service = new VisitanteService();

    void listarVisitantes() {
        List<Visitante> lista = service.listar();

        for (Visitante v : lista) {
            System.out.println(v);
        }
    }
}
