package com.kw_0910.Repositories;

import com.kw_0910.Model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HelloRepository extends CrudRepository<Person, Long> {
}
