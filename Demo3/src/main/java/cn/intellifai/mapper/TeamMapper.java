package cn.intellifai.mapper;

import cn.intellifai.entity.Team;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by zhushuangfei on 2017/10/18.
 */
@Mapper
public interface TeamMapper {

    @Select("select * from team order by id")
    List<Team> find();

    @Select("select * from team where id=#{id}")
    Team findById(int id);

    @Insert("insert into team (team,amount) values (#{team},#{amount})")
    void insert(Team team);

    @Update("update team set team=#{team},amount=#{amount} where id=#{id}")
    void update(Team team);

    @Delete("delete from team where id=#{id}")
    void delete(int id);

}
