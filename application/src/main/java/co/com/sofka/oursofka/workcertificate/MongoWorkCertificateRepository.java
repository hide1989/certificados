package co.com.sofka.oursofka.workcertificate;

import co.com.sofka.oursofka.workcertificate.domian.WorkCertificate;
import co.com.sofka.oursofka.workcertificate.usecase.WorkCertificateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.util.logging.Logger;

@Component
public class MongoWorkCertificateRepository implements WorkCertificateRepository {
    private static final Logger logger = Logger.getLogger(MongoWorkCertificateRepository.class.getName());

    @Autowired
    private ReactiveMongoTemplate template;


    @Override
    public Mono<WorkCertificate> save(WorkCertificate workCertificate) {
        logger.info("saved");
        return template.save(workCertificate);
    }
}
