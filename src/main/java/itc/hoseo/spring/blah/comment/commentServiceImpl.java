package itc.hoseo.spring.blah.comment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

@Service
public class commentServiceImpl implements CommentService{
	@Autowired
	private CommentMapper mapper;

	@Override
	public List<Comment> getComments() {
		// TODO Auto-generated method stub
		return mapper.getComments();
	}

	@Override
	public List<Comment> findComments(Comment c) {
		// TODO Auto-generated method stub
		return mapper.findComments(c);
	}

	@Override
	public int addComment(Comment c) {
		// TODO Auto-generated method stub
		return mapper.addComment(c);
	}

	@Override
	public int updateComment(Comment c) {
		// TODO Auto-generated method stub
		return mapper.updateComment(c);
	}

	@Override
	public int deleteComment(Comment c) {
		// TODO Auto-generated method stub
		return mapper.deleteComment(c);
	}

}
