package annotate;

import java.lang.annotation.*;

/**
 * @author yangyeshen
 * @date 2023/5/21 16:16
 * @description
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Entity {
}
