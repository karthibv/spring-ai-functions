package guru.springframework.springaifunctions.services;


import guru.springframework.springaifunctions.model.Answer;
import guru.springframework.springaifunctions.model.Question;

/**
 * Created by jt, Spring Framework Guru.
 */
public interface OpenAIService {

    Answer getStockPrice(Question question);

    Answer getAnswer(Question question);
}
