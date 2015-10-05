/**
 * <h1>ConfigurationBean.java</h1><br>
 * Tajoy Create on 2015年10月3日 下午3:15:58
 * 
 * @version 0.1
 * @see
 * @author Tajoy tj328111241@gmail.com
 * 
 */


package cn.tbox.tajoy.sow.config;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <h1>ConfigurationBean</h1><br>
 * 
 * @author Tajoy
 *
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ConfigurationBean {

    String module();
}
