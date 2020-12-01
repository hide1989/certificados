package co.com.sofka.oursofka.workcertificate.usecase;

import co.com.sofka.oursofka.workcertificate.WorkCertificateRepository;
import co.com.sofka.oursofka.workcertificate.domian.WorkCertificate;
import co.com.sofka.oursofka.workcertificate.model.WorkCertificateModel;
import reactor.core.publisher.Mono;

import java.util.Objects;

public class GenerateCertificate implements GenericUseCase {

    private final WorkCertificateRepository workCertificateRepository;

    public GenerateCertificate(WorkCertificateRepository workCertificateRepository){
        this.workCertificateRepository = workCertificateRepository;
    }

    @Override
    public Mono<Void> executor(Mono<WorkCertificateModel> model) {
        return validationOf(model)
                .map(input -> new WorkCertificate(
                        input.getFechaIngreso(),
                        input.getFechaActual(),
                        input.getTipoContrato(),
                        input.getCompania()
                )).flatMap(workCertificateRepository::save).then();
    }

    private Mono<WorkCertificateModel> validationOf(Mono<WorkCertificateModel> model) {
        return model.filter(this::validateModel)
                .switchIfEmpty(Mono.defer(() -> Mono.error(new IllegalArgumentException())));
    }

    private boolean validateModel(WorkCertificateModel workCertificateModel) {
        return Objects.nonNull(workCertificateModel.getCompania());
    }


}
