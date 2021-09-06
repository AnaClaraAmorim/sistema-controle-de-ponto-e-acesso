package com.dio.santander.model;

import lombok.*;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Localidade {
    private long id;
    @ManyToOne //1 nivel de acesso tem varias localidades
    private NivelAcesso nivelAcesso;
    private String descricao;

}
