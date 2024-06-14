package com.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RecordCreateController {
    @Autowired
    @Lazy
    DataService dataService;

    RecordCreateController() {
        System.out.println("RecordCreateController");
    }

    static int counter = 0;

    @GetMapping("/add")
    public void getUpdates() {
        //dataService.addRecord("ANURAG " +counter);
        dataService.addRecord("EMP " + counter);
        counter++;

    }

    @GetMapping("/update2")
    public void getUaaaaaaaaaaaaapdates() {
        dataService.updateRecord(3, "EMP 2222");

    }

    @GetMapping("/update5")
    public void getUaaaaaawwwwaaaaaaapdates() {
        dataService.updateRecord(5, "EMP 5555");

    }

    @GetMapping("/update6")
    public void getUaaaaaaaaaaaassapdates() {
        dataService.updateRecord(6, "EMP 66666");

    }

}