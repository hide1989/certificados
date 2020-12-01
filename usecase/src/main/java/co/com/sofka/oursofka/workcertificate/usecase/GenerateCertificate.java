package co.com.sofka.oursofka.workcertificate.usecase;

import co.com.sofka.oursofka.workcertificate.domian.WorkCertificate;
import co.com.sofka.oursofka.workcertificate.usecase.model.WorkCertificateModel;
import reactor.core.publisher.Mono;

public class GenerateCertificate implements IGenerateCertificateUseCase {

    private final WorkCertificateRepository workCertificateRepository;

    public GenerateCertificate(WorkCertificateRepository workCertificateRepository){
        this.workCertificateRepository = workCertificateRepository;
    }

    @Override
    public Mono<Void> executor(Mono<WorkCertificateModel> model) {
        return model.map(input -> new WorkCertificate(
                input.getFechaIngreso(), input.getFechaActual(), input.getTipoContrato(), input.getCompania()
        )).doOnNext(workCertificateRepository::save).then();
    }
}
