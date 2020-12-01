package co.com.sofka.oursofka.workcertificate;

import co.com.sofka.oursofka.workcertificate.model.WorkCertificateModel;
import reactor.core.publisher.Mono;

public interface IGenerateCertificateUseCase {
     Mono<Void> executor(Mono<WorkCertificateModel> model);
}
