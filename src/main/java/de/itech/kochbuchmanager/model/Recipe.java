package de.itech.kochbuchmanager.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "recipre_titel"), name = "recipe")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String recipre_titel;
    private String category;
    private String level;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User author_id;

    @Column(name = "method")
    private String method;

    @OneToMany(mappedBy = "recipe")
    private List<RecipeIngredient> ingredients;
}
