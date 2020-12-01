package co.com.sofka.oursofka.workcertificate;

import co.com.sofka.oursofka.workcertificate.usecase.GenerateCertificate;
import co.com.sofka.oursofka.workcertificate.model.WorkCertificateModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/api")
public class WorkCertificateController {

    @Autowired
    private GenerateCertificate generateCertificate;


    @PostMapping
    public Mono<Void> create(@RequestBody Mono<WorkCertificateModel> model){
        return generateCertificate.executor(model);
    }
}
