package cn.intellifai;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by zhushuangfei on 2017/11/1.
 */
@EnableSwagger2
@Configuration
public class Swagger2Config {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("cn.intellifai.Controller"))//为当前包路径
                .paths(PathSelectors.any())
                .build();
    }


    //构建 api文档的详细信息函数
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring Boot 测试使用 Swagger2 构建RESTful API")//页面标题
                .termsOfServiceUrl("http://localhost/")
                .contact("zhushuangfei")//创建人
                .version("1.0") //版本号
                .description("API 描述")//描述
                .build();
    }
}
