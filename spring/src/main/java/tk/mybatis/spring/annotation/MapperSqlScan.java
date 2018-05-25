package tk.mybatis.spring.annotation;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @Author mingliang
 * @Date 2018-05-21 11:13
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(MapperSqlRegistrar.class)
public @interface MapperSqlScan {

    String basePackage();
}
