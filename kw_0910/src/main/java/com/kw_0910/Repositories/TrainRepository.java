package com.kw_0910.Repositories;

import com.kw_0910.Model.Train;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainRepository extends CrudRepository<Train, Long> {
    //SELECT * FROM Train;
}
