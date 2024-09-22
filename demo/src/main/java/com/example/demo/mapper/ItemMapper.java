package com.example.demo.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import com.example.demo.dto.Item;
import java.util.List;

@Mapper
public interface ItemMapper {

    @Select("select * from item order by id desc")
    List<Item> findAll();

    @Select("select * from item where id = #{id}")
    Item findOne(Long id);

    @Insert("insert into item (name, team, position) values (#{name}, #{team}, #{position})")
    @Options(useGeneratedKeys = true)
    void save(Item player);

    @Update("update item set name = #{name}, team = #{team}, position = #{position} where id = #{id}")
    void update(Item player);

    @Delete("delete from item where id = #{id}")
    void delete(Long id);
}
