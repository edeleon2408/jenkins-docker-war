/**
 * 
 */
package com.example.weblogic.weblogic.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.weblogic.weblogic.entity.Usuario;
import com.example.weblogic.weblogic.service.UsuarioService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;

/**
 * @author 15-cd006
 *
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/usuario")
@Api(value = "/usuario", description = "Gestion de usuarios.")
public class UsuarioApiController {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("/")
	public String hello() {
		return "Hola Erwin desde WebLogic 12c";
	}
	
	/**
	 * @return
	 */
	@ApiOperation(value = "Listar todos los usuarios.", response = ArrayList.class)
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Respuesta del Servicio para la Gestión de usuarios:\r\n"
                + "1. ArrayList<Usuario>.\r\n"
                + "2. Lista Vacia.\r\n"
                + "3. Error.\r\n")})
	@GetMapping(value = "/listar-usuario",produces = {"application/json"})
	public ResponseEntity<ArrayList<Usuario>> listarUsuario(HttpServletResponse response) {
		//response.addHeader("nombre", "Erwin");
		//HttpHeaders headers = new HttpHeaders();
		//headers.add(HttpHeaders.AUTHORIZATION, "token");
		//headers.add(HttpHeaders.COOKIE, "cookie");
		
		return ResponseEntity.ok(usuarioService.listarUsuarios());
	}
}
