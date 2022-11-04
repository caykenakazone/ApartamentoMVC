package com.apartamento.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Apartamento {
    private int idAp, numPortas, qtdPortas;
    private Propietario propietario;
    private String tipo;
}
