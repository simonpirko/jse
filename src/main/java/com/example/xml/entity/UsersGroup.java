package com.example.xml.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "users")
public class UsersGroup {
    private List<User> list;

    public UsersGroup() {
    }

    public UsersGroup(List<User> list) {
        this.list = list;
    }

    @XmlElement(name = "user")
    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }
}
