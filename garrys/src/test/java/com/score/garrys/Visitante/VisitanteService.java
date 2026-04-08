package com.score.gmod;

import java.util.List;

class VisitanteService {

    VisitanteRepository repository = new VisitanteRepository();

    List<Visitante> listar() {
        return repository.listar();
    }
}
