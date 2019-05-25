package itc.hoseo.spring.blah.comment;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import itc.hoseo.spring.blah.comment.Comment.CommentBuilder;

@Mapper
public interface CommentMapper {
	public List<Comment> getComments();
	public List<Comment> findComments(Comment com);
	
	public int addComment(CommentBuilder commentBuilder);
}
