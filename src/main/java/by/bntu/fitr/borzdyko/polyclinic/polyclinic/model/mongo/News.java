package by.bntu.fitr.borzdyko.polyclinic.polyclinic.model.mongo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "news")
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private String title;
    private String description;

}
