/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Logica.Plataforma;
import Vista.Vista;

/**
 *
 * @author usuario
 */
public abstract class Controlador {
    public static Plataforma modelo;

    public Controlador(Plataforma modelo) {
        this.modelo = modelo;
    }

    public Plataforma getModelo() {
        return modelo;
    }
    public abstract Vista getVista();
    
}
