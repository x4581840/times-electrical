package com.timeselectrical.model;

import java.util.Date;

/**
 * @Description
 * @Author longjianyong
 * @Date 2019-06-12 09:44
 * @Version 1.0
 **/

public class StudentImpl extends Student {
    private long birthDate;

    public StudentImpl(Integer id, Integer age, String name, String scoreSum, String scoreAvg, long birthDate) {
        super(id, age, name, scoreSum, scoreAvg);
        this.birthDate = birthDate;
    }

    public long getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(long birthDate) {
        this.birthDate = birthDate;
    }
}
