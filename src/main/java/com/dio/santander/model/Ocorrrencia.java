package com.dio.santander.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Ocorrrencia {
    private long id;
    private String nome;
    private String descricao;

}
