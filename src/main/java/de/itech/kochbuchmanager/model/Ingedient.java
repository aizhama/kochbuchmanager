package de.itech.kochbuchmanager.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
//@Data

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Component
@Entity
@Getter
@Setter
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "ingredient_name"), name = "ingredients")
public class Ingedient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String ingredient_name;

    @ManyToMany
    @JoinTable(
            name = "ingredient_trait",
            joinColumns = @JoinColumn(name = "ingredient_id"),
            inverseJoinColumns = @JoinColumn(name = "trait_id")
    )
    private List<Trait> traits;

}
