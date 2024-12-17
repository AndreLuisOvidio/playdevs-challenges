package dev.ovidio.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.UUID;


@Entity
public class Usuario extends PanacheEntityBase {

    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    public UUID id;
    public String nome;
    public String senha;

}
