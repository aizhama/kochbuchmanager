package de.itech.kochbuchmanager.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
//@Data

import javax.persistence.*;
import java.util.Set;

@Component
@Entity
@Getter
@Setter
@Table(name = "ingredient", schema = "postgres")
public class Ingedient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    @Column(unique = true, name = "ingredient_name")
    private String ingredient_name;

    @ManyToMany
    @JoinTable(
            name = "ingredient_trait",
            joinColumns = @JoinColumn(name = "ingredient_id"),
            inverseJoinColumns = @JoinColumn(name = "trait_id")
    )
    private Set<Trait> traits;

}
