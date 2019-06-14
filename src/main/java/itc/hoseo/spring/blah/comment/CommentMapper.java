package itc.hoseo.spring.blah.comment;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommentMapper {
	public List<Comment> getComments();

	public List<Comment> findComments(Comment c);

	public int addComment(Comment c);

	public int updateComment(Comment c);

	public int deleteComment(Comment c);
}