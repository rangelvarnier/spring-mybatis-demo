package com.example.mybatisdemo;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;
import java.util.Set;

@Mapper
public interface PersonRepository {

    @Select("SELECT * FROM person as person " +
            "WHERE person.id = #{id}")
    @Results( id = "personResult", value = {
            @Result(property = "id", column = "id", id = true),
            @Result(property = "name", column = "name"),
            @Result(property="address", column="id", javaType= List.class, many=@Many(select="getAddress")),
            @Result(property = "addressIds", column="id", javaType = List.class, many=@Many(select = "getAddressIds"))
        }
    )
    List<Person> findById(long id);

    @Select("SELECT id, description "
            + " FROM address WHERE address.person_id = #{person_id}")
    @Results( id = "addressResult", value = {
            @Result(property = "id", column = "id", id = true),
            @Result(property = "description", column = "description")
    })
    List<Address> getAddress(Long person_id);


    @Select("SELECT id "
            + " FROM address WHERE address.person_id = #{person_id}")
    @Results( id = "addressIdsResult", value = {
            @Result(property = "id", column = "id", id = true),
    })
    List<Long> getAddressIds(Long person_id);

}
