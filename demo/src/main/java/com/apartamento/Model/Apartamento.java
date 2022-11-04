package com.apartamento.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Apartamento {
    private int idAp;
    private Propietario idProp;
    private int numPortas;
    private int qtdPortas;
    private String tipo;
}
