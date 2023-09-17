package ba.sum.fpmoz.igre.repositories;

import ba.sum.fpmoz.igre.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {}
