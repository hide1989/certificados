package co.com.sofka.oursofka.workcertificate.config;

import co.com.sofka.oursofka.workcertificate.GenerateCertificate;
import co.com.sofka.oursofka.workcertificate.repository.MongoWorkCertificateRepository;
import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public GenerateCertificate generateCertificate(MongoWorkCertificateRepository repository){
        return new GenerateCertificate(repository);
    }
}