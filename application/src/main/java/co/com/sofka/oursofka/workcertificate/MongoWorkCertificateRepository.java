package co.com.sofka.oursofka.workcertificate;

import co.com.sofka.oursofka.workcertificate.domian.WorkCertificate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.logging.Logger;

@Service
public class MongoWorkCertificateRepository implements WorkCertificateRepository {
    private static final Logger logger = Logger.getLogger(MongoWorkCertificateRepository.class.getName());

    @Autowired
    private ReactiveMongoTemplate reactiveMongoTemplate;


    @Override
    public Mono<WorkCertificate> save(WorkCertificate workCertificate) {
        return reactiveMongoTemplate.save(workCertificate)
                .doOnNext(e-> logger.info("saved "+workCertificate.toString()));
    }
}
