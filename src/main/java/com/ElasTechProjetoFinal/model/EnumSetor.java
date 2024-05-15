package com.ElasTechProjetoFinal.model;

import org.springframework.security.core.GrantedAuthority;

public enum EnumSetor implements GrantedAuthority {

    FINANCEIRO("SETOR_FINANCEIRO"),
    COMERCIAL("SETOR_COMERCIAL"),
    OPERACIONAL("SETOR_OPERACIONAL"),
    ADMINISTRATIVO("SETOR_ADMINISTRATIVO"),
    RH("SETOR_RH"),
    TI("SETOR_TI");

    private final String authority;

    EnumSetor(String authority){this.authority = authority;}

    @Override
    public String getAuthority() {
        return authority;
    }
}