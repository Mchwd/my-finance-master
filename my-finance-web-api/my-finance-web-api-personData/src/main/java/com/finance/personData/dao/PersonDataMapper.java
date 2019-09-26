package com.finance.personData.dao;

import com.finance.personData.dto.PersonDataDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonDataMapper {
    int deleteByPrimaryKey(Integer personId);

    int insert(PersonDataDto record);

    int insertSelective(PersonDataDto record);

    PersonDataDto selectByPrimaryKey(Integer personId);

    List<PersonDataDto> selectAllByPrimaryKey();

    int updateByPrimaryKeySelective(PersonDataDto record);

    int updateByPrimaryKey(PersonDataDto record);
}