package br.com.alura.rh.service.promocaoFuncionario;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;

public class PromocaoService {
    public void promover(Funcionario funcionario, boolean metaBatida) {
        var cargoAtual = funcionario.getCargo();
        if (Cargo.GERENTE == cargoAtual) {
            throw new ValidacaoException("Gerentes não podem ser promovidos.");
        }
        if (metaBatida) {
            Cargo novoCargo = cargoAtual.getProximoCargo();
            funcionario.promoverFuncionario(novoCargo);

        } else {
            throw new ValidacaoException("Funcionário nao pode ser promovido pois nao bateu a meta.");
        }
    }

}
