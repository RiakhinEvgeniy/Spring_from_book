package services;

import lombok.Getter;
import model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import proxies.CommentNotificationProxy;
import repositories.CommentRepository;

import java.util.logging.Logger;

@Getter
@Service
public class CommentService {
    private final Logger log = Logger.getLogger(CommentService.class.getName());
    private final CommentNotificationProxy commentNotificationProxy;
    private final CommentRepository commentRepository;

    @Autowired
    public CommentService(@Qualifier("EMAIL") CommentNotificationProxy commentNotificationProxy, CommentRepository commentRepository) {
        this.commentNotificationProxy = commentNotificationProxy;
        this.commentRepository = commentRepository;
    }

    public void publishComment(Comment comment) {
        log.info("Publishing comment-> " + comment.getText());
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }


}
