import configuration.ProjectConfiguration;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

public class ChapterFourApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        CommentService commentService = context.getBean(CommentService.class);

        Comment comment = createComment();

        commentService.publishComment(comment);
    }

    protected static Comment createComment() {
        Comment comment = new Comment();
        comment.setAuthor("Evgeniy");
        comment.setText("Demo comment");
        return comment;
    }
}
