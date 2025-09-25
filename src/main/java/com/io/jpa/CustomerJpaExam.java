package io.jpa;

import io.jpa.entity.Customer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class CustomerJpaExam {

    public static void main(String[] args) {
        //entity 매니저를 얻어오기 위한 factory 설정
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("tdd-challenge");

        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        //트랜잭션 시작 > 데이터 업데이트 > 커밋 > 닫기단계

        //트랜젝션 시작
        tx.begin();

        //데이터 업데이트 로직
        em.persist(Customer.sample());


        tx.commit();
        //tx.commit(); 또는 tx.rollback();
        //닫아주는 단계가 필요하다.
        em.close();
        emf.close();

    }
}
