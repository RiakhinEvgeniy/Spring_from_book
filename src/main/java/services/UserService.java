package services;

import lombok.Getter;
import model.Comment;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import repositories.CommentRepository;

@Getter
@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class UserService {
    private final CommentRepository commentRepository;

    public UserService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
    }
}
