package pl.sda.project.aconfig;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import pl.sda.project.Application;

@Configuration
@PropertySources({
        @PropertySource("classpath:persistence.properties"),
        @PropertySource("classpath:application.properties")}
)

@ComponentScan(basePackageClasses = Application.class)
class ApplicationConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}