package org.example;

import org.example.repository.entity.*;
import org.example.utility.HibernateUtility;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session= HibernateUtility.getSessionFactory().openSession();
        Transaction transaction= session.beginTransaction();

        BaseEntity baseEntityOgretmen1=new BaseEntity("Cuma","Sahin","12345678901");
        Ogretmen ogretmen1=Ogretmen.builder()
                .baseEntity(baseEntityOgretmen1)
                .iseBaslamaTarihi(LocalDate.of(1985,9,11))
                .brans(EBrans.MATEMATIK)
                .build();
        session.save(ogretmen1);

        BaseEntity baseEntityOgrenci1=new BaseEntity("Ali","Yildiz","12345643210");
        BaseEntity baseEntityOgrenci2=new BaseEntity("Veli","Yilmaz","12345678907");

        Ogrenci ogrenci1=Ogrenci.builder()
                .baseEntity(baseEntityOgrenci1)
                .dogumTarihi(LocalDate.of(2005,7,21))
                .build();
        Ogrenci ogrenci2=Ogrenci.builder()
                .baseEntity(baseEntityOgrenci2)
                .build();
        session.save(ogrenci1);
        session.save(ogrenci2);

        Sinif sinif1=Sinif.builder()
                .sinifAdi("11-D")
                .ogretmenId(ogretmen1.getId())
                .ogrenciler(List.of(ogrenci1.getBaseEntity().getIsim(),ogrenci2.getBaseEntity().getIsim()))
                .build();
        session.save(sinif1);
        transaction.commit();
        session.close();
    }
}