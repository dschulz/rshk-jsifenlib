package com.roshka.sifen.model.de.types;

public enum TiTipIDRespDE {

    CEDULA_PARAGUAYA((short)1, "Cédula paraguaya"),
    PASAPORTE((short)2, "Pasaporte"),
    CEDULA_EXTRANJERA((short)3, "Cédula extranjera"),
    CARNET_DE_RESIDENCIA((short)4, "Carnet de residencia"),
    OTRO((short)9, null);

    private short val;
    private String descripcion;

    TiTipIDRespDE(short val, String descripcion) {
        this.val = val;
        this.descripcion = descripcion;
    }

    public short getVal() {
        return val;
    }

    public String getDescripcion() {
        return descripcion;
    }

}