package root.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@EqualsAndHashCode(of = "id")
@Entity
public class Person {

    @Id
    private String id;

    private String name;

}
