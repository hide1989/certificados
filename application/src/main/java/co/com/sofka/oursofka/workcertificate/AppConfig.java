package co.com.sofka.oursofka.workcertificate;

import co.com.sofka.oursofka.workcertificate.usecase.GenerateCertificate;
import com.mongodb.reactivestreams.client.MongoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;

@Configuration
public class AppConfig {
    @Autowired
    private MongoClient mongoClient;

    @Bean
    public GenerateCertificate generateCertificate(MongoWorkCertificateRepository repository){
        return new GenerateCertificate(repository);
    }

    @Bean
    public ReactiveMongoTemplate reactiveMongoTemplate() {
        return new ReactiveMongoTemplate(mongoClient, "test");
    }
}