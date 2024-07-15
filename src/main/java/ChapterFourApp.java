import configuration.ProjectConfiguration;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;
import services.UserService;

public class ChapterFourApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        CommentService commentService = context.getBean(CommentService.class);
        UserService userService = context.getBean(UserService.class);

        Comment comment = createComment();

        commentService.publishComment(comment);
        userService.publishComment(comment);
    }

    protected static Comment createComment() {
        Comment comment = new Comment();
        comment.setAuthor("Evgeniy");
        comment.setText("Demo comment");
        return comment;
    }
}
