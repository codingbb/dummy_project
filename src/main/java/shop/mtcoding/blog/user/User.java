package shop.mtcoding.blog.user;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.sql.Timestamp;

@Table(name = "user_tb")
@Data
@Entity
public class User {
    @Id // PK 설정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment 전략
    private Integer id;

    private String password;

    @Column(unique=true)
    private String username;

    private String name;

    @Column(unique=true)
    private String phone;

    @Column(unique=true)
    private String email;

    private Date birth;
    private String address;

    //private Resume resume;
    private Timestamp createdAt;

}
