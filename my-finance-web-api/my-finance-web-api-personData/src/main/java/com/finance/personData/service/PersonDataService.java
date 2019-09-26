package com.finance.personData.service;

import com.finance.personData.dto.PersonDataDto;

import java.util.List;

public interface PersonDataService {
    int deleteByPrimaryKey(Integer personId);

    int insert(PersonDataDto record);

    int insertSelective(PersonDataDto record);

    PersonDataDto selectByPrimaryKey(Integer personId);

    List<PersonDataDto> selectAllByPrimaryKey();

    int updateByPrimaryKeySelective(PersonDataDto record);

    int updateByPrimaryKey(PersonDataDto record);
}
