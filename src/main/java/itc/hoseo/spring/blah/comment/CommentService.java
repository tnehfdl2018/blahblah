package itc.hoseo.spring.blah.comment;

import java.util.List;

import org.springframework.stereotype.Service;


public interface CommentService {
	
	public List<Comment> getComments();

	public List<Comment> findComments(Comment c);

	public int addComment(Comment c);

	public int updateComment(Comment c);

	public int deleteComment(Comment c);

}
