/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

import java.util.List;
import Modelo.Propietario;

/**
 *
 * @author User
 */
interface IPropietarioServicio {
    public Propietario crear(Propietario propietario);
    public List<Propietario> listar();
    public Propietario buscarporId(int idPropietario);
    public Propietario eliminar(int idPropietario);
}
