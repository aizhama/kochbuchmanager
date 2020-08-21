package de.itech.kochbuchmanager.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Set;

@Component
@Entity
@Table(name = "recipe", schema = "postgres")
public class Recipe {

    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Getter
    @Setter
    @Column(unique = true, name = "recipre_titel")
    private String recipre_titel;

    @Getter
    @Setter
    @Column(name = "catagory")
    private String catagory;

    @Getter
    @Setter
    @Column(name = "level")
    private String level;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User author_id;

    @Getter
    @Setter
    @Lob
    @Column(name = "method")
    private String method;

    @Getter
    @Setter
    @OneToMany(mappedBy = "recipe")
    private Set<Recipe_Ingredient> ingredients;
}
