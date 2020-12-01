package co.com.sofka.oursofka.workcertificate;

import java.util.Date;

public class WorkCertificate {
    private Date fechaIngreso;
    private Date fechaActual;
    private String tipoContrato;
    private String compania;

    public WorkCertificate(){

    }

    public WorkCertificate(Date fechaIngreso, Date fechaActual, String tipoContrato, String compania) {
        this.fechaIngreso = fechaIngreso;
        this.fechaActual = fechaActual;
        this.tipoContrato = tipoContrato;
        this.compania = compania;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaActual() {
        return fechaActual;
    }

    public void setFechaActual(Date fechaActual) {
        this.fechaActual = fechaActual;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }
}
