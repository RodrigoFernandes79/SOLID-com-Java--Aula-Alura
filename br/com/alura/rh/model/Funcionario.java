package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.LocalDateTime;

import br.com.alura.rh.ValidacaoException;

public class Funcionario {
    private DadosPessoais dadosPessoais;
    private LocalDate dataUltimoReajuste;

    public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario) {
        this.dadosPessoais = new DadosPessoais(nome, cpf, cargo, salario);
    }

    public void reajustarSalario(BigDecimal novoSalario) {
        this.dadosPessoais.setSalario(novoSalario);
        this.dataUltimoReajuste = LocalDate.now();

    }

    public void promoverFuncionario(Cargo novoCargo) {
        this.dadosPessoais.setCargo(novoCargo);
    }

    public String getNome() {
        return dadosPessoais.getNome();
    }

    public void setNome(String nome) {
        this.dadosPessoais.setNome(nome);
    }

    public String getCpf() {
        return dadosPessoais.getCpf();
    }

    public void setCpf(String cpf) {
        this.dadosPessoais.setCpf(cpf);
    }

    public Cargo getCargo() {
        return dadosPessoais.getCargo();
    }

    public void setCargo(Cargo cargo) {
        this.dadosPessoais.setCargo(cargo);
    }

    public BigDecimal getSalario() {
        return dadosPessoais.getSalario();
    }

    public void setSalario(BigDecimal salario) {
        this.dadosPessoais.setSalario(salario);
    }

    public LocalDate getDataUltimoReajuste() {
        return dataUltimoReajuste;
    }

    public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
        this.dataUltimoReajuste = dataUltimoReajuste;
    }


}
