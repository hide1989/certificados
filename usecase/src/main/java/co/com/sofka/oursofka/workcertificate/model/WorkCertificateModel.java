package co.com.sofka.oursofka.workcertificate.model;

import lombok.Data;

import java.util.Date;

@Data
public class WorkCertificateModel {
    private Date fechaIngreso;
    private Date fechaActual;
    private String tipoContrato;
    private String compania;
}
