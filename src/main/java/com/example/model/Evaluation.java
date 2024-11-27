package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "evaluation", schema = "evaluation")
public class Evaluation implements Serializable {
    @Id
    @Column(columnDefinition = "uuid")
    private UUID id;

    @Column(name = "person_id")
    private Long personId;

}
