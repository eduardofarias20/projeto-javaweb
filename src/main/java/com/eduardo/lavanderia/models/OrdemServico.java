package com.eduardo.lavanderia.models;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ORDEM_SERVICOS")
@SequenceGenerator(name = "SEQ_ORDEM_SERVICO",allocationSize = 10, sequenceName = "SEQ_ORDEM_SERVICO")

public class OrdemServico implements Entidade {

    @Id
    @Column(name = "ID_ORDEM_SERVICO")
    @GeneratedValue(generator = "SEQ_ORDEM_SERVICO", strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne()
    @JoinColumn(name = "ID_CLIENTE", foreignKey = @ForeignKey(name = "FK_ORDEM_SERVICO_CLIENTE", value = ConstraintMode.CONSTRAINT))
    private Cliente cliente;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_ENTRADA")
    private Date dataEntrada;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_RETIRADA")
    private Date dataRetirada;

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(Date dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    @Override
    public Long getId() {
        return id;
    }
}
