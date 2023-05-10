package com.study.springboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.study.springboot.dto.WriteDto;


@Mapper
public interface WriteImpleDao {

	 public List<WriteDto> listDao();
	 public WriteDto viewDao(String id);
	 public int writeDao(String writer, String title, String content);//글쓰기
	 public int deleteDao(@Param("_id") String id);//글삭제
	 public void writeModify(String id, String writer, String title, String content);//글수정
}
