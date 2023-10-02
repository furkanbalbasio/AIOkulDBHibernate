package org.example.repository;

import org.example.repository.entity.BaseEntity;
import org.example.repository.entity.EBrans;
import org.example.repository.entity.Ogrenci;
import org.example.repository.entity.Ogretmen;
import org.example.utility.HibernateUtility;
import org.example.utility.ICrud;
import org.example.utility.MyFactoryRepository;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.time.LocalDate;
import java.util.List;

public class OgrenciRepository extends MyFactoryRepository<Ogrenci,Long> {
    public OgrenciRepository(){
        super(new Ogrenci());
    }
//    private Session session;
//    private Transaction transaction;
//    private void openSession(){
//        session=HibernateUtility.getSessionFactory().openSession();
//        transaction=session.beginTransaction();
//    }
//    private void closeSession(){
//        transaction.commit();
//
//        session.close();
//    }
//    @Override
//    public Ogrenci save(Ogrenci entity) {
//
//    }
//
//    @Override
//    public void update(Ogrenci entity) {
//
//    }
//
//    @Override
//    public Ogrenci findById(Long id) {
//        return null;
//    }
//
//    @Override
//    public List<Ogrenci> findAll() {
//        return null;
//    }


//    public static void main(String[] args) {
//        Session session;
//        Transaction transaction;
//        session= HibernateUtility.getSessionFactory().openSession();
//        transaction= session.beginTransaction();
//        BaseEntity baseEntityOgrenci1=new BaseEntity("Ali","Yildiz","12345643210");
//        BaseEntity baseEntityOgrenci2=new BaseEntity("Veli","Yilmaz","12345678907");
//
//        Ogrenci ogrenci1=Ogrenci.builder()
//                .baseEntity(baseEntityOgrenci1)
//                .dogumTarihi(LocalDate.of(2005,7,21))
//                .build();
//        Ogrenci ogrenci2=Ogrenci.builder()
//                .baseEntity(baseEntityOgrenci2)
//                .build();
//        session.save(ogrenci1);
//        session.save(ogrenci2);
//        transaction.commit();
//        session.close();
//    }
}
