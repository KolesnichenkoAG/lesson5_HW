package ru.geekbrains;

public class MainApp {

    public static void main(String[] args) {
        SessionFactoryUtils sessionFactoryUtils = new SessionFactoryUtils();
        sessionFactoryUtils.init();
        try {
            ProductDao productDao = new ProductDao(sessionFactoryUtils);

            Product product = productDao.findById(1L);
            product.print();

            productDao.saveOrUpdate(new Product("Sugar", 900));
            System.out.println(productDao.findAll());

            productDao.deleteById(4L);
            System.out.println(productDao.findAll());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessionFactoryUtils.shutdown();
        }
    }
}
