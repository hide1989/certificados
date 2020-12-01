package co.com.sofka.oursofka.workcertificate.controller;

import co.com.sofka.oursofka.workcertificate.GenerateCertificate;
import co.com.sofka.oursofka.workcertificate.model.WorkCertificateModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class WorkCertificateController {


    private GenerateCertificate generateCertificate;

    @Autowired
    public WorkCertificateController(GenerateCertificate generateCertificate){
        this.generateCertificate = generateCertificate;
    }

    @PostMapping
    public Mono<Void> create(Mono<WorkCertificateModel> model){
        return generateCertificate.executor(model);
    }
}
