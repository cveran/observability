package com.vera.nag.model;

public class AdmCliente  {
	
	private long clienteId;
    private String numeroCuenta;
    private String titular;
    private double saldo;
    private String tipoCuenta;
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
