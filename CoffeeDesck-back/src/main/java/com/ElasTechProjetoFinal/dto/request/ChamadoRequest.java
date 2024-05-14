package com.ElasTechProjetoFinal.dto.request;

import com.ElasTechProjetoFinal.model.Prioridade;
import com.ElasTechProjetoFinal.model.Setor;
import com.ElasTechProjetoFinal.model.Usuario;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChamadoRequest {

    @NotNull
    @JsonProperty("titulo")
    private String titulo;

    @NotNull
    @JsonProperty("descricao")
    private String descricao;

    @NotNull
    @JsonProperty("setor")
    private Setor setor;

    @NotNull
    @JsonProperty("prioridade")
    private Prioridade prioridade;

    @NotNull
    @JsonProperty("usuario")
    private Usuario usuario;

    @NotNull
    @JsonProperty("dataInicio")
    private String dataInicio;

    @NotNull
    @JsonProperty("dataTermino")
    private String dataTermino;
}