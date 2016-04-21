package evilc.treasurebox.base;

import evilc.treasurebox.annotation.dao.Transient;

import java.io.Serializable;
import java.util.*;

/**
 *
 *
 * Value对象的基类，当使用<code>DaoTemplate</code>时，Value对象继承这个类，多表关联查询时，
 * 其他表的字段会存入props（Map）中
 *
 * Created by Administrator on 2016/4/21.
 */
public abstract class BaseDataObject implements Serializable {

    private static final long serialVersionUID = -9073130072281330425L;

    protected Map<String, Object> props;

    public BaseDataObject(){
        props = new HashMap<String, Object>();
    }

    @Transient
    public Map<String, Object> getProps() {
        return props;
    }

    public void setProps(Map<String, Object> props) {
        this.props = props;
    }

}
