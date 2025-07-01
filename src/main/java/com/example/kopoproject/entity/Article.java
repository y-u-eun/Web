package com.example.kopoproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity // 해당 클래스가 엔티티임을 명시 -> 테이블이 생성됨
// @Table(name = "MenuBoard") -> 테이블 이름을 지정할 수 있음
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Article {
    @Id // id임을 명시
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 자동으로 Id를 1씩 증가
    private Long id;

    @Column // 컬럼임을 명시
    private String title;

    @Column
    private String content;

}
