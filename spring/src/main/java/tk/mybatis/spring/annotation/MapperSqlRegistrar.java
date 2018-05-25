package tk.mybatis.spring.annotation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConstructorArgumentValues;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.env.Environment;
import org.springframework.core.env.StandardEnvironment;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.type.AnnotationMetadata;
import tk.mybatis.mapper.annotation.MapperSql;
import tk.mybatis.mapper.mapperhelper.MapperHelper;

import java.util.List;

/**
 *
 *  找到指定包下面一个类的所有子类
 *
 * @Author mingliang
 * @Date 2018-05-21 10:34
 */
public class MapperSqlRegistrar implements ImportBeanDefinitionRegistrar, ResourceLoaderAware, EnvironmentAware{

    public static final Logger LOGGER = LoggerFactory.getLogger(MapperSqlRegistrar.class);

    private ResourceLoader resourceLoader;

    private StandardEnvironment environment;

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = (StandardEnvironment) environment;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
//        AnnotationAttributes annoAttrs = AnnotationAttributes.fromMap(importingClassMetadata.getAnnotationAttributes(MapperSqlScan.class.getName()));
//        String basePackage = annoAttrs.getString("basePackage");
//        LOGGER.info("------ ===================, basePackage = {}",basePackage);
//       String[] beanDefinitionNames = beanDefinitionRegistry.getBeanDefinitionNames();
//        MapperHelper mapperHelper = new MapperHelper();
//       for (String name : beanDefinitionNames){
//           BeanDefinition beanDefinition = beanDefinitionRegistry.getBeanDefinition(name);
//           List<ConstructorArgumentValues.ValueHolder> list = beanDefinition.getConstructorArgumentValues().getGenericArgumentValues();
//           if (null == list || list.size() <= 0){
//               continue;
//           }
//           String className = String.valueOf(list.get(0).getValue());
//           if (null != className && className.startsWith(basePackage)){
//               try {
//                   Class cls = Class.forName(className);
//                   // 查找类是否Mapper注解
//                   MapperSql mapperSql = (MapperSql) cls.getAnnotation(MapperSql.class);
//                   if (mapperSql != null){
//                       mapperHelper.registerMapper(cls);
//                   }
//                   LOGGER.info("----------------====-------------,{}",cls);
//               } catch (ClassNotFoundException e) {
//                  LOGGER.info("exception = {} ",e);
//               }
//           }
//       }
    }
}
