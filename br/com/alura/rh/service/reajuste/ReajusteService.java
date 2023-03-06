package br.com.alura.rh.service.reajuste;

import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.util.List;

public class ReajusteService {

    private List<ValidacaoReajuste> validacoes;

    public ReajusteService(List<ValidacaoReajuste> validacoes) {
        this.validacoes = validacoes;
    }

    public void reajustarSalariodoFuncionario(Funcionario funcionario, BigDecimal aumento) {

        validacoes.forEach(v -> v.validar(funcionario, aumento));

        var salarioReajustado = funcionario.getSalario().add(aumento);
        funcionario.reajustarSalario(salarioReajustado);
    }
}
