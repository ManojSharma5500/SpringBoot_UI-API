package com.example.APIservice;

import com.example.APIentity.Datalist;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class DataServiceImpl implements DataService {

    List<Datalist> datalist;
    public DataServiceImpl(){
        datalist = new ArrayList<>();
        datalist.add(new Datalist(1, "test1","test1"));
        datalist.add(new Datalist(2, "test2","test2"));
    }

    @Override
    public List<Datalist> getDatalist() {
        return datalist;
    }
}

