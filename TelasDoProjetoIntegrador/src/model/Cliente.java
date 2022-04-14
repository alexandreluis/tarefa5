/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;


/**
 *
 * @author alexandreluisrigotti
 */
public class Cliente
{
    private String Nome;
    private String email;
    private String senha;
    TipoDeCliente tipoDeCliente;
    
    ArrayList<Cliente> listaDeAmigos = new ArrayList<>();
}