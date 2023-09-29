package org.example.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tbl_Ogretmen")
public class Ogretmen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    java.lang.Long id;

    @Embedded
    BaseEntity baseEntity;

    @Enumerated(EnumType.STRING)
    EBrans brans;

    @Builder.Default
    @Column(nullable = false)
    LocalDate iseBaslamaTarihi=LocalDate.now();
}
