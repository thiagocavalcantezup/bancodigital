package com.zupedu.bancodigital.domain.contas;

import static javax.persistence.EnumType.STRING;
import static javax.persistence.GenerationType.IDENTITY;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.StringJoiner;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import com.zupedu.bancodigital.domain.correntistas.Correntista;

@Entity
public class Conta {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Enumerated(STRING)
    @NotNull
    private TipoConta tipo;

    @NotNull
    private BigDecimal saldo = BigDecimal.ZERO;

    @ManyToOne
    @NotNull
    private Correntista correntista;

    /**
     * @deprecated para uso dos frameworks
     */
    @Deprecated
    public Conta() {}

    public Conta(TipoConta tipo, Correntista correntista) {
        this.tipo = tipo;
        this.correntista = correntista;
    }

    public void deposita(BigDecimal valor) {
        this.saldo = saldo.add(valor);
    }

    public Long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Conta conta = (Conta) o;
        return tipo == conta.tipo && Objects.equals(correntista, conta.correntista);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipo, correntista);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Conta.class.getSimpleName() + "[", "]").add(
            "id=" + id
        ).add("tipo=" + tipo).add("saldo=" + saldo).add("correntista=" + correntista).toString();
    }

}
