package com.dio.santander.model;

import lombok.*;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Usuario {
    private Long id;
    @ManyToOne //varios usuarios podem ter 1 categoria
    private CategoriaUsuario categoriaUsuario;
    private String nome;
    @ManyToOne //1 empresa varios usuarios
    private Empresa empresa;
    @ManyToOne
    private NivelAcesso nivelAcesso;
    @ManyToOne
    private JornadaTrabalho jornadaTrabalho;
    private BigDecimal tolerancia;
    private LocalDateTime inicioJornada;
    private LocalDateTime finalJornada;
}
