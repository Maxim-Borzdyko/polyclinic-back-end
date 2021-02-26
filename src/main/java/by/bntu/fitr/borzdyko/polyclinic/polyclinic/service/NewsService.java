package by.bntu.fitr.borzdyko.polyclinic.polyclinic.service;

import by.bntu.fitr.borzdyko.polyclinic.polyclinic.model.mongo.News;
import by.bntu.fitr.borzdyko.polyclinic.polyclinic.repository.mongodb.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {

    private final NewsRepository newsRepository;

    @Autowired
    public NewsService(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    public List<News> getAll() {
        return newsRepository.findAll();
    }
}
