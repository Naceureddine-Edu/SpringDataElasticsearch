package com.elasticsearch.springdata.repository;

import com.elasticsearch.springdata.document.Person;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface PersonRepository extends ElasticsearchRepository<Person, String> {
}
