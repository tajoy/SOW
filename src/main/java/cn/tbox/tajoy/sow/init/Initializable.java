/**
 * <h1>Initializable.java</h1><br>
 * Tajoy Create on 2015年10月2日 下午5:12:12
 * 
 * @version 0.1
 * @see
 * @author Tajoy tj328111241@gmail.com
 * 
 */


package cn.tbox.tajoy.sow.init;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <h1>Initializable</h1><br>
 * 
 * 
 * 注解只能注解在 {@code public static boolean} 或 {@code public static void}
 * 修饰符下的无参数方法上. <br>
 * 如果方法的返回值为 {@code boolean} 并且当其被调用时初始化失败(返回 {@code false})时
 * 续初始化进程将停止.<br>
 * 被该注解所注解的方法将会被 {@link InitializationManager} 自动根据优先级调用.<br>
 * 相同优先级之间的初始化方法调用顺序无法确定.<br>
 * <br>
 * {@code int priority}: (默认值 0)<br>
 * 执行被注解的初始化方法优先级, 值越大则运行越靠前.<br>
 * 即,根据优先级升序排序后执行初始化方法.<br>
 * 
 * @author Tajoy
 *
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Initializable {

    int priority() default 0;
}
