//package itc.hoseo.spring.blah;
//
//import static org.assertj.core.api.Assertions.setLenientDateParsing;
//import static org.junit.Assert.assertEquals;
//
//import java.text.SimpleDateFormat;
//import java.time.LocalTime;
//import java.util.Date;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import itc.hoseo.spring.blah.comment.Comment;
//import itc.hoseo.spring.blah.comment.CommentMapper;
//import itc.hoseo.spring.blah.team.Team;
//import lombok.Data;
//
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class CommentTest {
//	
//	@Autowired
//	private CommentMapper commentMapper;
//	
//	@Test
//	public void testFindComments() {
//		Comment c = new Comment();
//		c.setWriter("최수빈");
//		System.out.println("잘되는중");
//		Comment teamNameKr = commentMapper.findComments(c).get(0);
//		
//		
//		assertEquals("기아 타이거즈", teamNameKr.getTeamNameKr());
//	}
//	
//	@Test
//	public void testGetComments() {
//		assertEquals(3, commentMapper.getComments().size());
//	}
//	
////	@Test
////	public void testAddComment() {
////		Date date = new Date();
////		System.out.println("들어가라 얍!");
////		System.out.println(date);
////		commentMapper.addComment(Comment.builder()
////					  .teamNameKr("두산 베어스")
////					  .subject("제목이랍니다.")
////					  .writer("이다일")
////					  .content("내용입니다.")
////
////					  .build());
////		
////		assertEquals(4, commentMapper.getComments().size());
////	}
//	
//	@Test
//	public void testUpdateComment() {
//		commentMapper.updateComment(Comment.builder()
//				.teamNameKr("두산 베어스").build());
//	}
//	
//	
//	
//	@Test
//	public void deleteComment() {
//		commentMapper.deleteComment(Comment.builder()
//				.teamNameKr("두산 베어스").build());
//	}
//	
//	
//	
//}
