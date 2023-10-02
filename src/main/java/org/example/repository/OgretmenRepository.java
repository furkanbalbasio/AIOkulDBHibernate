package org.example.repository;

import org.example.repository.entity.BaseEntity;
import org.example.repository.entity.EBrans;
import org.example.repository.entity.Ogretmen;
import org.example.utility.HibernateUtility;
import org.example.utility.MyFactoryRepository;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.time.LocalDate;

public class OgretmenRepository extends MyFactoryRepository<Ogretmen,Long> {
    public OgretmenRepository(){
        super(new Ogretmen());
    }
//    public static void main(String[] args) {
//
//         Session session;
//         Transaction transaction;
//         session= HibernateUtility.getSessionFactory().openSession();
//         transaction= session.beginTransaction();
//        BaseEntity baseEntityOgretmen1=new BaseEntity("Cuma","Sahin","12345678901");
//        Ogretmen ogretmen1=Ogretmen.builder()
//                .baseEntity(baseEntityOgretmen1)
//                .iseBaslamaTarihi(LocalDate.of(1985,9,11))
//                .brans(EBrans.MATEMATIK)
//                .build();
//        session.save(ogretmen1);
//        transaction.commit();
//        session.close();
//    }

}
