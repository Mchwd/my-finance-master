package com.finance.personData.web.controller;

import com.finance.personData.dto.PersonDataDto;
import com.finance.personData.service.PersonDataService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonDataController {
    @Autowired
    private PersonDataService personDataService;

    /**
     * 根据id查找数据
     *
     * @param integer
     * @return
     */
    @RequestMapping("/selectByPrimaryKey/{id}")
    public PersonDataDto selectByPrimaryKey(@PathVariable("id") Integer integer) {
        PersonDataDto personDataDto = personDataService.selectByPrimaryKey(integer);
        return personDataDto;
    }

    /**
     * 查找所有的记录
     *
     * @return
     */
    @RequestMapping("/selectAllByPrimaryKey")
    public List<PersonDataDto> selectAllByPrimaryKey() {
        return personDataService.selectAllByPrimaryKey();
    }

    /**
     * 添加记录
     * 1、主键自增
     *
     * @param personDataDto
     * @return
     */
    @RequestMapping("/insert")
    public Integer insert(@Param("personDataDto") PersonDataDto personDataDto) {

        return personDataService.insert(personDataDto);
    }


    /**
     * 根据主键删除
     *
     * @param integer
     * @return
     */
    @RequestMapping("/deleteByPrimaryKey")
    public Integer deleteByPrimaryKey(@Param("integer") Integer integer) {
        return personDataService.deleteByPrimaryKey(integer);
    }

    /**
     * 修改数据
     *
     * @param personDataDto
     * @return
     */
    @RequestMapping("/updateByPrimaryKey")
    public Integer updateByPrimaryKey(@Param("personDataDto") PersonDataDto personDataDto) {
        return personDataService.updateByPrimaryKey(personDataDto);
    }

}
