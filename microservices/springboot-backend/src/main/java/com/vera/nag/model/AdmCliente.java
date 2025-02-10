package com.vera.nag.model;

import jakarta.persistence.*;

@Table(name = "adm_cliente")
@Entity
public class AdmCliente {

    @Id
    @Column(name = "cliente_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long clienteId;
    
    @Column
    private String numeroCuenta;
    @Column
    private String titular;
    @Column
    private double saldo;
    @Column
    private String tipoCuenta;
    @Column
    private boolean activa;
    
    
	public long getClienteId() {
		return clienteId;
	}
	public void setClienteId(long clienteId) {
		this.clienteId = clienteId;
	}
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getTipoCuenta() {
		return tipoCuenta;
	}
	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}
	public boolean isActiva() {
		return activa;
	}
	public void setActiva(boolean activa) {
		this.activa = activa;
	}
    
    
    

    
}
