package jpabook.jpashop;

import jpabook.jpashop.domain.Album;
import jpabook.jpashop.domain.Book;
import jpabook.jpashop.domain.Order;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpashop");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            /*
            Book book = new Book();
            book.setName("JPA");
            book.setAuthor("가나다라");

            Album album = new Album();
            album.setArtist("Linkin park");
            album.setPrice(30000);

            em.persist(book);
            em.persist(album);
            */


            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }

        emf.close();
    }
}
