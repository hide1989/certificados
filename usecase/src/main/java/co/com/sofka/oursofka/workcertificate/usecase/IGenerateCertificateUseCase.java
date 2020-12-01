package co.com.sofka.oursofka.workcertificate.usecase;

import co.com.sofka.oursofka.workcertificate.usecase.model.WorkCertificateModel;
import reactor.core.publisher.Mono;

public interface IGenerateCertificateUseCase {
     Mono<Void> executor(Mono<WorkCertificateModel> model);
}
