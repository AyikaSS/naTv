package kg.mega.naTV.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Configuration {

    public static final String CHANNELS = "Каналы";
    public static final String DAYS = "Дни";
    public static final String DISCOUNTS = "Скидки";
    public static final String OrderDETAILS = "Подробности заказа";
    public static final String ORDERS = "Заказы";
    public static final String PRICES = "Цены";


    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("kg.mega.NaTV.controllers"))
                .paths(PathSelectors.any())
                .build().apiInfo(apiEndPointsInfo())
                .tags(new Tag(CHANNELS, ""))
                .tags(new Tag(DAYS, ""))
                .tags(new Tag(DISCOUNTS, ""))
                .tags(new Tag(OrderDETAILS, ""))
                .tags(new Tag(ORDERS, ""))
                .tags(new Tag(PRICES, ""));
    }

    private ApiInfo apiEndPointsInfo(){
        return new ApiInfoBuilder()
                .title("NaTV")
                .description("Place where you can order text advertising")
                .version("1.0.0")
                .build();
    }
}
