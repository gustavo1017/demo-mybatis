package com.example.demo.mapper;

import com.example.demo.models.Author;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface IAuthor {

    public Author find();

}
