package co.com.sofka.oursofka.workcertificate;

import co.com.sofka.oursofka.workcertificate.usecase.model.WorkCertificateModel;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.web.reactive.function.BodyInserters;

@ExtendWith(SpringExtension.class)
@WebFluxTest(controllers = WorkCertificateController.class)
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