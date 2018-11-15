package com.example.jpa;

import com.example.jpa.entity.Status;
import com.example.jpa.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        EntityManagerFactory entityManagerFactory = Persistence
                .createEntityManagerFactory("Eclipselink_JPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

//        File img = new File("C:\\Users\\sipi7\\Desktop\\9.jpg");
//        ByteArrayOutputStream bos = new ByteArrayOutputStream();
//        ImageIO.write(ImageIO.read(img), fileUtils(img), bos);
//        byte[] bytes = bos.toByteArray();

        User simon = new User();
        simon.setFirstName("Sips");
        simon.setLastName("Pips");
//        simon.setImage(bytes);
        Status status = new Status();
        status.setValue("GUEST");
        simon.setStatus(status);
        entityManager.persist(simon);

//        byte[] image = entityManager.find(User.class, 106).getImage();
//        ByteArrayInputStream bis = new ByteArrayInputStream(image);
//        BufferedImage bImage2 = ImageIO.read(bis);
//        ImageIO.write(bImage2, "jpg", new File("output.jpg"));

//        Logger logger = Logger.getLogger(Main.class);
//        logger.info(entityManager.find(User.class, 110).getStatus().getValue());

        entityManager.flush();

        transaction.commit();
        entityManager.close();
        entityManagerFactory.close();
    }

    private static String fileUtils(File file) {
        String res = "jpg";
        String var1 = file.getName();
        int var2 = var1.lastIndexOf(".");
        if (var2 > 0) {
            return res = var1.substring(var2 + 1);
        }
        return res;
    }
}
