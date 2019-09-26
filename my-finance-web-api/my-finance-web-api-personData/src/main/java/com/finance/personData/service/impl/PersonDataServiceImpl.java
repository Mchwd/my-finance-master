package com.finance.personData.service.impl;

import com.finance.personData.dao.PersonDataMapper;
import com.finance.personData.dto.PersonDataDto;
import com.finance.personData.service.PersonDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonDataServiceImpl implements PersonDataService {
    @Autowired
    private PersonDataMapper personDataMapper;

    @Override
    public int deleteByPrimaryKey(Integer personId) {
        return personDataMapper.deleteByPrimaryKey(personId);
    }

    @Override
    public int insert(PersonDataDto record) {
        return personDataMapper.insert(record);
    }

    @Override
    public int insertSelective(PersonDataDto record) {
        return personDataMapper.insertSelective(record);
    }

    @Override
    public PersonDataDto selectByPrimaryKey(Integer personId) {
        return personDataMapper.selectByPrimaryKey(personId);
    }

    @Override
    public List<PersonDataDto> selectAllByPrimaryKey() {
        return personDataMapper.selectAllByPrimaryKey();
    }

    @Override
    public int updateByPrimaryKeySelective(PersonDataDto record) {
        return personDataMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PersonDataDto record) {
        return personDataMapper.updateByPrimaryKey(record);
    }
}
