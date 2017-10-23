package cn.intellifai.entity;


import java.sql.Timestamp;

/**
 * Created by zhushuangfei on 2017/10/18.
 */
public class Status {

    private int id;
    private int sid;
    private int status;
    private Timestamp time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Status{" +
                "id=" + id +
                ", sid=" + sid +
                ", status=" + status +
                ", time=" + time +
                '}';
    }
}
