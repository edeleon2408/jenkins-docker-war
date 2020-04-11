/**
 * 
 */
package com.example.weblogic.weblogic.service;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.weblogic.weblogic.entity.Usuario;

/** Habilitar esta clase solo si se va a conectar a una Base de datos a traves del DataSource del .properties
 * @author 15-cd006
 *
 */
public interface UsuarioRepository extends JpaRepository<Usuario, String>{

	/**
	 * @param user
	 * @param password
	 * @return Usuario
	 */
	@Query("select u.user, u.password from Usuario u where u.user=:user and u.password=:password")
	Usuario getUsuarioByUserAndPassword(String user, String password);
	

	@Query("select u from Usuario u")
	public List<Usuario> listarUsuariosBD();
}
