package org.chotu.springelastic.search.api.model1;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Document(indexName = "users1", type = "users1", shards = 21)
@Setter
@Getter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Student {
	@Id
private String id;
private String name;


}
