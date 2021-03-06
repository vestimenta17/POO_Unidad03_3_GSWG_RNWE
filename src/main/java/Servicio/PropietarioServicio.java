/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.Propietario;
import java.util.ArrayList;
import java.util.List;

public class PropietarioServicio implements IPropietarioServicio {

    private final List<Propietario> propietarioList = new ArrayList<>();

    @Override
    public Propietario crear(Propietario propietario) {
        this.propietarioList.add(propietario);
        return propietario;
    }

    @Override
    public List<Propietario> listar() {
        return this.propietarioList;
    } 

    @Override
    public Propietario buscarporId(int idPropietario) {
        for (var propietario : this.propietarioList) {
            if (propietario.getIdPropietario() == idPropietario) {
                return propietario;
            }

        }
        throw new RuntimeException("NO SE HA ENCONTRADO");
    }
    @Override
    public Propietario eliminar(int idPropietario) {
        var propietario = this.buscarporId(idPropietario);
        this.propietarioList.remove(propietario);
        return propietario;
    }
}
