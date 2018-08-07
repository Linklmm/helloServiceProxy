package com.likeh;
@Table("user")
public class User {
    @Column("id")
    private int id;
    @Column("username")
    private String username;
    @Column("password")
    private String password;
}
