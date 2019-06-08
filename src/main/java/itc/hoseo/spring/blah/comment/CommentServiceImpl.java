package itc.hoseo.spring.blah.comment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService{
	
	@Autowired
	private CommentMapper mapper;
	
	@Override
	public List<Comment> getComments() {
		return mapper.getComments();
	}

	@Override
	public List<Comment> findComments(Comment c) {
		return mapper.findComments(c);
	}

	@Override
	public int addComment(Comment c) {
		return mapper.addComment(c);
	}

	@Override
	public int updateComment(Comment c) {
		return mapper.updateComment(c);
	}

	@Override
	public int deleteComment(Comment c) {
		return mapper.deleteComment(c);
	}

}
