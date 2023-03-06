package br.com.alura.rh.service;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidacaoPeriodicidadeEntreReajustes implements ValidacaoReajuste {
    public void validar(Funcionario funcionario, BigDecimal aumento) {
        var dataUltimoReajuste = funcionario.getDataUltimoReajuste();
        var dataAtual = LocalDate.now();
        var diferencaMesReajuste = Duration.between(dataAtual, dataUltimoReajuste).get(ChronoUnit.MONTHS);
        if (diferencaMesReajuste < 6) {
            throw new ValidacaoException("Funcionário só pode receber novo reajuste após 6 meses.");
        }
    }
}
