/**
 * 
 */
package com.example.weblogic.weblogic.service;
 
import java.util.ArrayList;

import com.example.weblogic.weblogic.entity.Usuario;

/**
 * @author 15-cd006
 *
 */
public interface UsuarioService {

	public ArrayList<Usuario> listarUsuarios();
	public ArrayList<Usuario> listarUsuariosBD();
	public Usuario obtenerUsuario();
}
