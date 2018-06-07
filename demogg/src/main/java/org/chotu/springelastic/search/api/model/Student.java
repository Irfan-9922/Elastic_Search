package org.chotu.springelastic.search.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Document(indexName = "foof", type = "model", shards = 2)
public class Student {
	@Id
private int id;
private String name;
public Student() {
	super();
}
public Student(int i, String string) {
	// TODO Auto-generated constructor stub
}


}
