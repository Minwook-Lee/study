package com.example.demo.menu.entity;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MenuEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //값을 입력하면 자동으로 값을 남ㄱ미
    @Comment("아이디")
    private Long menuId;

    @Column(name = "price", nullable = false, length = 64)
    @Comment("가격")
    private Long price;

    @Column(name = "name", nullable = false, length = 64)
    @Comment("이름")
    private String name;

    @Builder
    public MenuEntity(Long price, String name) {
        this.price = price;
        this.name = name;
    }

    public void update(Long price, String name) {
        this.price = price;
        this.name = name;
    }
}