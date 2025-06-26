package com.example.kopoproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity // 해당 클래스가 엔티티임을 명시 -> 테이블이 생성됨
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Article {
    @Id // id임을 명시
    @GeneratedValue // 자동으로 Id를 1씩 증가
    private Long id;

    @Column // 컬럼임을 명시
    private String title;

    @Column
    private String content;

}
