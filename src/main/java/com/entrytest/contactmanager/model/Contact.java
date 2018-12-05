package com.entrytest.contactmanager.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Data
public class Contact {
    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private String fullName;
    private String nickName;
    private String title;
    private String company;
    @Email
    private String email;
    @Digits(integer = 12, fraction = 0)
    private String phone;
    private Date birthday;
    private String note;

    public Contact() {
    }

    public Contact(@NotNull String fullName, String nickName, String title, String company, @Email String email, @Digits(integer = 12, fraction = 0) String phone, Date birthday, String note) {
        this.fullName = fullName;
        this.nickName = nickName;
        this.title = title;
        this.company = company;
        this.email = email;
        this.phone = phone;
        this.birthday = birthday;
        this.note = note;
    }
}
