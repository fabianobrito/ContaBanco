package br.com.curso.dio.santander;

import java.math.BigDecimal;

public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private BigDecimal Saldo;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setSaldo(BigDecimal saldo) {
        Saldo = saldo;
    }

    @Override
    public String toString() {
        return "Olá " + nomeCliente + ", obrigado por criar " +
                "uma conta em nosso banco, sua " +
                "agência é " + agencia + ", conta " + numero + " e seu " +
                "saldo " + Saldo + " já está disponível para saque";
    }
}
