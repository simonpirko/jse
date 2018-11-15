package com.example.xml;

import com.example.xml.entity.User;
import com.example.xml.entity.UsersGroup;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;

public class JaxbPars {
    public void parse(File f, Class c) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(c);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        UsersGroup usersGroup = (UsersGroup) unmarshaller.unmarshal(f);
        List<User> list = usersGroup.getList();
        list.forEach(System.out::println);  //Test out
    }

    public void marshal(File f, Object o) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(o.getClass());
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(o, f);
    }

    public static void main(String[] args) throws JAXBException {
        File file = new File("users.xml");
//
//        User simon = new User(1, "Simon","a@a.ru");
//        User denis = new User(2, "Denis","d@d.de");
//
//        List<User> users = new ArrayList<User>();
//        users.add(simon);
//        users.add(denis);
//
//        UsersGroup usersGroup = new UsersGroup(users);
//
        JaxbPars jaxbPars = new JaxbPars();
        jaxbPars.parse(file, UsersGroup.class);
//        jaxbPars.marshal(file, usersGroup);
    }
}
