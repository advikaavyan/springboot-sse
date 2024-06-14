package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DataService {

    @Autowired
    private SSEController sseController;

    DataService(){
        System.out.println("DataService");
    }

    private final List<String> records = new ArrayList<>();

    public List<String> getRecords() {
        return records;
    }

    public void addRecord(String record) {
        records.add(record);
        sseController.notifyClients("ADD " + record);
    }

    public void updateRecord(int index, String record) {
        if (index >= 0 && index < records.size()) {
            records.set(index, record);
            sseController.notifyClients("UPDATE " + index + " " + record);
        }
    }
}
