package yxw.example.hessiandemoserver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianServiceExporter;
import yxw.example.user.remoting.UserRemoting;

@Configuration
public class HessianRemotingConfiguration {
    private final UserRemoting userRemoting;

    public HessianRemotingConfiguration(UserRemoting userRemoting) {
        this.userRemoting = userRemoting;
    }

    @Bean("/remoting/UserRemoting")
    HessianServiceExporter exportUserRemoting() {
        HessianServiceExporter exporter = new HessianServiceExporter();
        exporter.setService(userRemoting);
        exporter.setServiceInterface(UserRemoting.class);
        return exporter;
    }
}
