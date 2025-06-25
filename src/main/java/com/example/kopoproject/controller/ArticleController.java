package com.example.kopoproject.controller;

import com.example.kopoproject.repository.ArticleRepository;
import com.example.kopoproject.dto.ArticleForm;
import com.example.kopoproject.entity.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.text.AttributedString;
import java.util.Optional;

@Controller
@Slf4j
public class ArticleController {
    @Autowired  // 의존성 주입(DI; Dependency Injection) 애노테이션
    private ArticleRepository articleRepository;

    @GetMapping("/article/new")
    public String newArticleForm() {
        return "articles/new";
    }

    @PostMapping("/article/create") // 생성 요청
    public String newArticle(ArticleForm articleForm){  // DTO로 데이터를 수집
        log.info(articleForm.toString());
        // DTO -> Entity
        Article article = articleForm.toEntity();
        log.info(article.toString());
        // Repo -> DB save
        Article saved = articleRepository.save(article);
        log.info(saved.toString());
        // View
        return "articles/new";
    }

    @GetMapping("/article/{number}")
    public String articleShow(@PathVariable long number, Model model) {
        // @PathVariable : 요청 변수 수집
        log.info("number : " + number);
        // 게시글 번호를 확인해서 view 처리

        // id 값을 조회 - DB
        Article saved = articleRepository.findById(number).orElse(null);
        // Optional<Article> saved = articleRepository.findById(number);

        // addAttribute 활용해서 모델에 데이터 등록
        model.addAttribute("article", saved);
        // view 화면에 보여주기

        return "articles/show";
    }
}
