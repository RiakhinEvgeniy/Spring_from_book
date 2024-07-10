import model.Comment;
import proxies.CommentNotificationProxy;
import proxies.EmailCommentNotificationProxy;
import repositories.CommentRepository;
import repositories.DBCommentRepository;
import services.CommentService;

public class ChapterFourApp {
    public static void main(String[] args) {
        CommentRepository dbCommentRepository = new DBCommentRepository();
        CommentNotificationProxy emailCommentNotificationProxy = new EmailCommentNotificationProxy();
        CommentService commentService = new CommentService(emailCommentNotificationProxy, dbCommentRepository);
        Comment comment = new Comment();
        comment.setAuthor("John Doe");
        comment.setText("Hello World!");
        commentService.publishComment(comment);
    }
}
