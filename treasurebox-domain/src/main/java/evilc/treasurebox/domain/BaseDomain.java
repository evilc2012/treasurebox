package evilc.treasurebox.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Random;

/**
 * Created by Administrator on 2016/4/21.
 */
public abstract class BaseDomain implements Serializable {

    private long id;
    private long createdBy;
    private long updatedBy;
    private Date createdTime;
    private Date updatedTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(long createdBy) {
        this.createdBy = createdBy;
    }

    public long getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(long updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public static void main(String[] args){
        for(int i = 0; i < 20; i++){
            System.out.println(new Random().nextInt(2));
        }
    }

}
