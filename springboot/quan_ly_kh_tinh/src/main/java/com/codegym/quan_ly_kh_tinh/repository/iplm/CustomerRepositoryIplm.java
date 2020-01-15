package com.codegym.quan_ly_kh_tinh.repository.iplm;

import com.codegym.quan_ly_kh_tinh.model.Customer;
import com.codegym.quan_ly_kh_tinh.repository.CustomerRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Repository
public class CustomerRepositoryIplm implements CustomerRepository {
@PersistenceContext
private EntityManager em;

    @Override
    public List<Customer> getAll() {
        TypedQuery<Customer> query = em.createQuery("select c from Customer c", Customer.class);
        return query.getResultList();
    }

    @Override
    public void save(Customer temp){
        if(temp.getId()!=null){
            em.merge(temp);

        }else {
            em.persist(temp);
        }
    }

    @Override
    public Customer findById(Long id) {
        TypedQuery<Customer> query = em.createQuery("select c from Customer c where c.id=:id", Customer.class);
        query.setParameter("id",id);
        try {
            return query.getSingleResult();
        }catch (NoResultException e) {
            return null;
        }
    }

    @Override
    public void remove(Long id) {
        Customer customer = findById(id);
        if(customer != null){
            em.remove(customer);
        }

    }

}
