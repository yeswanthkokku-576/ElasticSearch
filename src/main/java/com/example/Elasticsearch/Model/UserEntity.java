package com.example.Elasticsearch.Model;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Date;
import java.util.List;
import java.util.UUID;


@Document(indexName = "search")
public class UserEntity{
    @Id
    private String time;

    private String count;

    private Date lastTouched;


    public UserEntity() {

    }

    public Date getLastTouched() {
        return lastTouched;
    }

    public void setLastTouched(Date lastTouched) {
        this.lastTouched = lastTouched;
    }

    public String getData() {
        return count;
    }

    public void setData(String data) {
        this.count = data;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
