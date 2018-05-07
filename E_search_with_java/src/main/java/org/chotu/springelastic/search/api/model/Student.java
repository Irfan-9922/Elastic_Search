package org.chotu.springelastic.search.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Document(indexName = "users", type = "users", shards = 2)
@Setter
@Getter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Student {
	@Id
private int id;
private String name;


}
