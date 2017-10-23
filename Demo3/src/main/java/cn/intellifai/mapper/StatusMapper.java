package cn.intellifai.mapper;

import cn.intellifai.entity.Status;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by zhushuangfei on 2017/10/18.
 */
@Mapper
public interface StatusMapper {

    @Select("select * from status order by id")
    List<Status> find();

    @Select("select * from status where id=#{id}")
    Status findById(int id);

    @Insert("insert into status (sid,status,time) values (#{sid},#{status},#{time})")
    void insert(Status status);

    @Update("update status set sid=#{sid},status=#{status} where id=#{id}")
    void update(Status status);

    @Delete("delete from status where id=#{id}")
    void delete(int id);

    @Select("select * from status where sid=#{sid}")
    List<Status> findBySid(int sid);
}
