//package io.pivotal.web; /**
// * Created by rkrishna on 7/1/16.
// */
//
//import io.pivotal.spring.cloud.config.java.CloudConnectorsConfig;
//import org.springframework.amqp.rabbit.connection.ConnectionFactory;
//import org.springframework.cloud.netflix.eureka.EurekaClientConfigBean;
//import org.springframework.cloud.netflix.hystrix.amqp.HystrixConnectionFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
////import org.springframework.cloud.netflix.eureka.EurekaClientConfigBean;
//
//@Configuration
//public class WebApplicationConfiguration extends CloudConnectorsConfig {
//
//        @Bean
//        @HystrixConnectionFactory
//        public ConnectionFactory hystrixConnectionFactory() {
//            return connectionFactory().hystrixConnectionFactory();
//           // return connectionFactory().hystrixConnectionFactory();
//        }
//
//        @Bean
//        public EurekaClientConfigBean eurekaClientConfig() {
//            return connectionFactory().eurekaClientConfig();
//        }
//}
