package co.com.sofka.oursofka.workcertificate.usecase;

import co.com.sofka.oursofka.workcertificate.model.WorkCertificateModel;
import reactor.core.publisher.Mono;

public interface GenericUseCase {
     Mono<Void> executor(Mono<WorkCertificateModel> model);
}
