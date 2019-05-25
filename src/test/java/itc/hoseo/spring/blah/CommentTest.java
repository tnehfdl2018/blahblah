package itc.hoseo.spring.blah;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import itc.hoseo.spring.blah.comment.Comment;
import itc.hoseo.spring.blah.comment.CommentMapper;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CommentTest {
	
	@Autowired
	private CommentMapper commentMapper;
	
	@Test
	public void testFindTeams() {
		Comment c = new Comment();
		c.setWriter("최수빈");
		Comment sub = commentMapper.findComments(c).get(0);
		
		assertEquals("기아 타이거즈",sub.getTeamNameKr());
	
	}
	
	@Test
	public void testAddTeam() {
		commentMapper.addComment(Comment.builder()
				.teamNameKr("두산 베어스")
				.Subject("제목이랍니다.")
				.writer("이다일")
				.content("내용입니다.")
				);
	}
	
}
