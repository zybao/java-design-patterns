package com.github.adapter.filter;

import java.util.List;

/**
 * Created by zhiyong.bao on 2017/6/13.
 */
public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
