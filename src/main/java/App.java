import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("market");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

//        transaction.begin();
//        Customer customer = new Customer();
//        customer.setName("Mustafa");
//        customer.setMail("adfaf@fasf");
//        customer.setGender(Customer.GENDER.MALE);
//        customer.setOnDate(LocalDate.now());
//        entityManager.persist(customer);
//        transaction.commit();

//        Customer customer = entityManager.find(Customer.class, 1);
//        System.out.println(customer.toString());

//        transaction.begin();
//        Customer customer = entityManager.find(Customer.class, 1);
//        customer.setName("DEVRAN");
//        entityManager.persist(customer);
//        transaction.commit();

//        transaction.begin();
//        Code code = new Code();
//        code.setGroup("45124");
//        code.setSerial("987665");
//        entityManager.persist(code);
//
//
//        Product product = new Product();
//        product.setName("Iphone 15");
//        product.setPrice(1234);
//        product.setStock(100);
//        product.setCode(code);
//
//        entityManager.persist(product);
//        System.out.println(product.toString());
//        transaction.commit();

        transaction.begin();
        Supplier supplier = new Supplier();
        supplier.setAddress("Adres");
        supplier.setCompany("Patika");
        supplier.setContact("23534636");
        supplier.setMail("bla@bla");
        supplier.setPerson("Devran");
        entityManager.persist(supplier);

        Category category = new Category();
        category.setName("Telefonlar");
        entityManager.persist(category);


        Code code = new Code();
        code.setGroup("45124");
        code.setSerial("987665");
        entityManager.persist(code);


        Product product = new Product();
        product.setName("Iphone 15");
        product.setPrice(1234);
        product.setStock(100);
        product.setCode(code);
        product.setSupplier(supplier);
        product.setCategory(category);
        entityManager.persist(product);
        System.out.println(product.toString());

        transaction.commit();

    }
}
