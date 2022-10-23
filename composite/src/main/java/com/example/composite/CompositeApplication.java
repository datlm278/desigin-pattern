package com.example.composite;

import com.example.composite.address.GroupAddress;
import com.example.composite.address.PersonalAddress;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CompositeApplication {

    public static void main(String[] args) {
        SpringApplication.run(CompositeApplication.class, args);

        PersonalAddress personalAddress= new PersonalAddress("Ba Dinh");
        personalAddress.sendMessageToAddress();
        System.out.println();

        //composite address
        GroupAddress haNoi = new GroupAddress("Ha Noi");
        PersonalAddress giaLam = new PersonalAddress("Gia Lam");
        PersonalAddress thanhXuan = new PersonalAddress("Thanh Xuan");
        haNoi.addPersonalAddress(giaLam);
        haNoi.addPersonalAddress(thanhXuan);
        GroupAddress dongAnh = new GroupAddress("Dong Anh");
        PersonalAddress kimChung = new PersonalAddress("Kim Chung");
        dongAnh.addPersonalAddress(kimChung);
        haNoi.addPersonalAddress(dongAnh);
        haNoi.sendMessageToAddress();
    }

}
