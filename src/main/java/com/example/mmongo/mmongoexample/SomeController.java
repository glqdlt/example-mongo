package com.example.mmongo.mmongoexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api")
public class SomeController {

    @Autowired
    private SomeLogRepo someLogRepo;


    @GetMapping("/log")
    public List<SomeLog> aa() {

        SomeLogSub2Renamer someLog = new SomeLogSub2Renamer();
        someLog.setTestField("test");
        someLogRepo.save(someLog);

        SomeLogSub someLogSub = new SomeLogSub();
        someLogSub.setColumnd1("columnd");
        someLogRepo.save(someLogSub);

        HashMap<String, Object> map = new HashMap<>();
        map.put("f1", "qqq");
        map.put("f2", 2);
        SomeLogSubDynamicField someLogSubDynamicField = new SomeLogSubDynamicField();
        someLogSubDynamicField.setDynamicField(map);

        someLogRepo.save(someLogSubDynamicField);
        List<SomeLog> aa = someLogRepo.findTop1000ByOrderByRegDateDesc();
        return aa;
    }
}
