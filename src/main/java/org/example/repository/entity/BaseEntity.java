package org.example.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Embeddable
public class BaseEntity {
    @Column(length = 30,nullable = false)
    String isim;

    @Column(length = 30,nullable = false)
    String soyisim;

    @Column(nullable = false,unique = true,length = 11)
    String tcKimlik;
}
