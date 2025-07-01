package com.example.kopoproject.dto;

import com.example.kopoproject.entity.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor // 생성자 대체
@ToString           // toString() 대체
@Getter             // getter
@Setter
public class ArticleForm {
    private Long id;
    private String title;
    private String content;

    // toString, cons, get, set

    public Article toEntity() {
        return new Article(id, title, content);
    }
}
