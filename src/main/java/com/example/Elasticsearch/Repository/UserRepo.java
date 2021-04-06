package com.example.Elasticsearch.Repository;


import com.example.Elasticsearch.Model.UserEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface UserRepo extends ElasticsearchRepository<UserEntity, String> {
}
