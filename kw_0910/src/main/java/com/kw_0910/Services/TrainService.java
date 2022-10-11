package com.kw_0910.Services;

import com.kw_0910.Model.Train;
import com.kw_0910.Repositories.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainService {
    private TrainRepository trainRepository;

    @Autowired
    public TrainService(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    public Iterable<Train> getAll(){
        return trainRepository.findAll();
    }

    public Train add(Train train){
        return trainRepository.save(train);
    }
}
