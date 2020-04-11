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
		return "Hola Erwin, esto es una prueba Jenkins-Docker-war-jobdsl";
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
	@GetMapping(value = "/listar-usuarios",produces = {"application/json"})
	public ResponseEntity<ArrayList<Usuario>> listarUsuarios(HttpServletResponse response) {
		//response.addHeader("nombre", "Erwin");
		//HttpHeaders headers = new HttpHeaders();
		//headers.add(HttpHeaders.AUTHORIZATION, "token");
		//headers.add(HttpHeaders.COOKIE, "cookie");
		
		return ResponseEntity.ok(usuarioService.listarUsuarios());
	}
	
	/**
	 * @return
	 */
	@ApiOperation(value = "Listar todos los usuarios de la BD.", response = ArrayList.class)
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Respuesta del Servicio para la Gestión de usuarios de la BD:\r\n"
                + "1. ArrayList<Usuario>.\r\n"
                + "2. Lista Vacia.\r\n"
                + "3. Error.\r\n")})
	@GetMapping(value = "/listar-usuariosbd",produces = {"application/json"})
	public ResponseEntity<ArrayList<Usuario>> listarUsuariosBD(HttpServletResponse response) {
		return ResponseEntity.ok(usuarioService.listarUsuariosBD());
	}
	
	/**
	 * @return
	 */
	@ApiOperation(value = "Obtener un usuario.", response = ArrayList.class)
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Respuesta del Servicio para la Gestión de un usuario:\r\n"
                + "1. Usuario.\r\n"
                + "2. Usuario null.\r\n"
                + "3. Error.\r\n")})
	@GetMapping(value = "/obtener-usuario",produces = {"application/json"})
	public ResponseEntity<Usuario> obtenerUsuario(HttpServletResponse response) {
		return ResponseEntity.ok(usuarioService.obtenerUsuario());
	}
	
	/**
	 * @return
	 */
	@ApiOperation(value = "Obtener Impuesto.", response = String.class)
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Respuesta del Servicio para la Gestión del impuesto:\r\n"
                + "1. Impuesto.\r\n"
                + "2. Impuesto null.\r\n"
                + "3. Error.\r\n")})
	@GetMapping(value = "/obtener-impuesto",produces = {"application/json"})
	public String obtenerImpuesto(HttpServletResponse response) {
		return "Bienvenido!, su impuesto es de 1.000";
	}
}
