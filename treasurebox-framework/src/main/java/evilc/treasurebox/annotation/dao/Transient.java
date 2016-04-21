package evilc.treasurebox.annotation.dao;

import java.lang.annotation.*;

/**
 *
 *
 * 忽略字段
 *
 * Created by Administrator on 2016/4/21.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Transient {

}
