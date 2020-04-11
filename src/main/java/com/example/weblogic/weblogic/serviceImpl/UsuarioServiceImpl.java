/**
 * 
 */
package com.example.weblogic.weblogic.serviceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.weblogic.weblogic.entity.Usuario;
import com.example.weblogic.weblogic.service.UsuarioRepository;
import com.example.weblogic.weblogic.service.UsuarioService;

/**
 * @author 15-cd006
 *
 */
@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public ArrayList<Usuario> listarUsuarios() {
		// TODO Auto-generated method stub
		ArrayList<Usuario> lstUser = new ArrayList<>();
		Usuario u1 = new Usuario();
		u1.setUser("edeleon@gmail.com");
		u1.setPassword("password1");
		Usuario u2 = new Usuario();
		u2.setUser("amara@gmail.com");
		u2.setPassword("password1");
		Usuario u3 = new Usuario();
		u3.setUser("dios@gmail.com");
		u3.setPassword("password1");
		
		lstUser.add(u1);
		lstUser.add(u2);
		lstUser.add(u3);
		
		return lstUser;
	}

	@Override
	public Usuario obtenerUsuario() {
		// TODO Auto-generated method stub
		Usuario u1 = new Usuario();
		u1.setUser("edeleon2408@gmail.com");
		u1.setPassword("edeleon2408");
		return u1;
	}

	@Override
	public ArrayList<Usuario> listarUsuariosBD() {
		// TODO Auto-generated method stub
		return (ArrayList<Usuario>) usuarioRepository.listarUsuariosBD();
	}

}
