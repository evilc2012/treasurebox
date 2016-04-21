package evilc.treasurebox.domain;

import evilc.treasurebox.annotation.dao.Column;
import evilc.treasurebox.annotation.dao.Id;
import evilc.treasurebox.base.BaseDataObject;

import java.io.Serializable;
import java.util.Date;
import java.util.Random;

/**
 * Created by Administrator on 2016/4/21.
 */
public abstract class BaseDomain extends BaseDataObject {

    private long id;
    private long createdBy;
    private long updatedBy;
    private Date createdTime;
    private Date updatedTime;

    @Id
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "created_by")
    public long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(long createdBy) {
        this.createdBy = createdBy;
    }

    @Column(name = "updated_by")
    public long getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(long updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Column(name = "created_time")
    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    @Column(name = "updated_time")
    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

}
