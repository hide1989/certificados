package co.com.sofka.oursofka.workcertificate.controller;

import co.com.sofka.oursofka.workcertificate.controller.WorkCertificateController;
import co.com.sofka.oursofka.workcertificate.model.WorkCertificateModel;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.web.reactive.function.BodyInserters;

@WebFluxTest(controllers = WorkCertificateController.class)
@ExtendWith( SpringExtension.class)
@Import(WorkCertificateController.class)
class WorkCertificateControllerTest {

    @Autowired
    private WebTestClient webTestClient;

    @Test
    void newWorkCertification(){
        var model = new WorkCertificateModel();
        webTestClient.post()
                .body(BodyInserters.fromValue(model))
                .exchange()
                .expectStatus().isCreated();
    }

}