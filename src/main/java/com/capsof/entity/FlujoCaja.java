package com.capsof.entity;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "FlujoCaja")
public class FlujoCaja {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_fc;
	
	@OneToOne
	@JoinColumn(name="id_serv", nullable = false, foreignKey = @ForeignKey(name = "fk_id_serv"))
	private Servicio id_serv;
	
	@ManyToOne
	@JoinColumn(name="id_cp", nullable = false, foreignKey = @ForeignKey(name = "fk_id_cp"))
	private ComprobantePago id_cp;
	
	@ManyToOne
	@JoinColumn(name="id_occ", nullable = false, foreignKey = @ForeignKey(name = "fk_id_occ"))
	private OrdenCompraCabecera id_occ;

	public int getId_fc() {
		return id_fc;
	}

	public void setId_fc(int id_fc) {
		this.id_fc = id_fc;
	}

	public Servicio getId_serv() {
		return id_serv;
	}

	public void setId_serv(Servicio id_serv) {
		this.id_serv = id_serv;
	}

	public ComprobantePago getId_cp() {
		return id_cp;
	}

	public void setId_cp(ComprobantePago id_cp) {
		this.id_cp = id_cp;
	}

	public OrdenCompraCabecera getId_occ() {
		return id_occ;
	}

	public void setId_occ(OrdenCompraCabecera id_occ) {
		this.id_occ = id_occ;
	}
	
	
}
