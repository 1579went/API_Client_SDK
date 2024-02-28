package icu.pignest.api_client_sdk;

import icu.pignest.api_client_sdk.client.API_Client;
import icu.pignest.api_client_sdk.service.ApiService;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author went
 * @date 2023/11/23 17:39
 **/
@Data
@Configuration
@ComponentScan
@ConfigurationProperties("api.client")
public class APIClientConfig {

    private String accessKey;

    private String secretKey;


    @Bean
    public API_Client apiClient(){
        return new API_Client(accessKey, secretKey);
    }
    @Bean
    public ApiService apiService(){
        return new ApiService(apiClient());
    }


}
