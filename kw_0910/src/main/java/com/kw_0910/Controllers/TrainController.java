package com.kw_0910.Controllers;

import com.kw_0910.Model.Train;
import com.kw_0910.Services.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/trains")
public class TrainController {
    private TrainService trainService;

    @Autowired
    public TrainController(TrainService trainService) {
        this.trainService = trainService;
    }

    @GetMapping("/")
    public String getAll(Model model) {
        model.addAttribute("trains", trainService.getAll());

        return  "Trains";
    }

    @GetMapping("/addForm")
    public String addForm(Model model){
        return "AddForm";
    }
    @GetMapping("/add")
    public String add(Model model,
                      @RequestParam String start,
                      @RequestParam String stop,
                      @RequestParam Integer distance,
                      @RequestParam Integer quantity,
                      @RequestParam String location,
                      @RequestParam(required=false, defaultValue="false") Boolean has_equipment
    ){
        Train train = new Train(
                start.substring(11),
                stop.substring(11),
                distance,
                quantity,
                location,
                has_equipment);
        trainService.add(train);
        return "Added";
    }
}
