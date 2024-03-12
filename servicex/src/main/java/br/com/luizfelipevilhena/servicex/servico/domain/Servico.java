package br.com.luizfelipevilhena.servicex.servico.domain;

import br.com.luizfelipevilhena.servicex.categoria.domain.Categoria;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="SERVICOS")
public class Servico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SERVICOS")
    private Integer idServicos;
    @Column(name = "NOME_SERVICOS")
    private Integer nomeServicos;
    @Column(name = "VALOR_SERVICOS")
    private double valor;
    @ManyToOne
    @JoinColumn(name = "idCategoria")
    private Categoria categoria;

}

