package co.com.sofka.oursofka.workcertificate;

import co.com.sofka.oursofka.workcertificate.usecase.GenerateCertificate;
import co.com.sofka.oursofka.workcertificate.usecase.model.WorkCertificateModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class WorkCertificateController {

    @Autowired
    private GenerateCertificate generateCertificate;


    @PostMapping
    public Mono<Void> create(Mono<WorkCertificateModel> model){
        return generateCertificate.executor(model);
    }
}
