package co.com.sofka.oursofka.workcertificate;

import reactor.core.publisher.Mono;

public interface WorkCertificateRepository {
    Mono<WorkCertificate> save(WorkCertificate workCertificate);
}
