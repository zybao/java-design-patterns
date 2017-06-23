package com.github.adapter.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhiyong.bao on 2017/6/13.
 */
public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<>();
        for (Person person : malePersons) {
            if (person.gender.equalsIgnoreCase("MALE")) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
