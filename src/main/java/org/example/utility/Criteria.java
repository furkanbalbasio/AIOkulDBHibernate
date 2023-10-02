package org.example.utility;

import org.example.utility.HibernateUtility;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class Criteria<T> implements ICrud<T> {

        private EntityManager entityManager;
        private CriteriaBuilder criteriaBuilder;

        T t;

    public Criteria(){
        entityManager= HibernateUtility.getSessionFactory().createEntityManager();
        criteriaBuilder=entityManager.getCriteriaBuilder();
    }
    public T findById(Long id){
        CriteriaQuery<T> criteria= (CriteriaQuery<T>) criteriaBuilder.createQuery(t.getClass());
        Root<T> root= (Root<T>) criteria.from(t.getClass());
        criteria.select(root);
        criteria.where(criteriaBuilder.equal(root.get("id"),id));
        T result=entityManager.createQuery(criteria).getSingleResult();
        System.out.println(result);
        return result;
    }

    @Override
    public List<T> findAll() {
        CriteriaQuery<T> criteria= (CriteriaQuery<T>) criteriaBuilder.createQuery(t.getClass());
        Root<T> root=(Root<T>)criteria.from(t.getClass());
        criteria.select(root);
        List<T> list=entityManager.createQuery(criteria).getResultList();
        list.forEach(System.out::println);
        return list;
    }
}
