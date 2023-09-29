package org.example.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tbl_ogrenci")
public class Ogrenci {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
   @Embedded
   BaseEntity baseEntity;

    @Builder.Default
    @Column(nullable = false)
    LocalDate dogumTarihi=LocalDate.now();
}
