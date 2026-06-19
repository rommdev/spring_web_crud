package com.ciberfarma.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tbl_usuario")
@Getter
@Setter
public class Usuario {

	@Id
	@Column(name = "id_usario")
	private Integer idUsuario;
	
	@Column(name = "nombres")
	private String nombres;
	
	@Column(name = "apellidos")
	private String apellidos;
	
	@Column(name = "cuenta")
	private String cuenta;
	
	@Column(name = "clave")
	private String clave;
	
	@Column(name = "fecha_nac")
	private LocalDate fechaNacimiento;
	
	@Column(name = "activo")
	private Boolean activo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tipo")
	private Tipo tipo;
	
	public String getFullName() {
		return String.format("%s %s", nombres, apellidos);
	}
}
