package org.example.repository;

import org.example.repository.entity.Sinif;
import org.example.utility.HibernateUtility;
import org.example.utility.MyFactoryRepository;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class SinifRepository extends MyFactoryRepository<Sinif,Long> {
    public SinifRepository(){
        super(new Sinif());
    }
//    public static void main(String[] args) {
//
//    }
}
