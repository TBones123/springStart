package ua.com.owu;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import ua.com.owu.dao.UserDao;
import ua.com.owu.models.User;
import ua.com.owu.service.UserService;

import javax.persistence.EntityManagerFactory;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:context.xml");
//        User userX = context.getBean("userX", User.class);
//        userX.setName("kokos");
//        System.out.println(context.getBean("userX", User.class));



//        LocalContainerEntityManagerFactoryBean factoryBean  =
//                new LocalContainerEntityManagerFactoryBean();
//        factoryBean.setPersistenceXmlLocation("classpath:/META-INF/persistence.xml");
//        factoryBean.setPersistenceUnitName("xxx");
//        factoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());



//        EntityManagerFactory nativeEntityManagerFactory =
//                entityManagerFactory.getNativeEntityManagerFactory();
//        UserDao userDao = context.getBean(UserDao.class);
//        User user = new User();
//        user.setName("asaas");
//        userDao.save(user);
        UserService userService = context.getBean(UserService.class);
        userService.save("vasua");

    }
}
