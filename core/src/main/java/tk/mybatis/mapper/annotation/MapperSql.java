package tk.mybatis.mapper.annotation;

import java.lang.annotation.*;
/**
 * @Author mingliang
 * @Date 2018-03-27 14:40
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface MapperSql {

    Class<?> type();

}
