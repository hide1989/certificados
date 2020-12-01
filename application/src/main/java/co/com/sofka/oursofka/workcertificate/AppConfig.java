package co.com.sofka.oursofka.workcertificate;

import co.com.sofka.oursofka.workcertificate.usecase.GenerateCertificate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public GenerateCertificate generateCertificate(MongoWorkCertificateRepository repository){
        return new GenerateCertificate(repository);
    }
}