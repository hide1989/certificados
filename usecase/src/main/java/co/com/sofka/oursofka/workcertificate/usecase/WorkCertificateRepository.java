package co.com.sofka.oursofka.workcertificate.usecase;

import co.com.sofka.oursofka.workcertificate.domian.WorkCertificate;
import reactor.core.publisher.Mono;

public interface WorkCertificateRepository {
    Mono<WorkCertificate> save(WorkCertificate workCertificate);
}
