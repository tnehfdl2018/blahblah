package itc.hoseo.spring.blah;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import itc.hoseo.spring.blah.comment.CommentMapper;
import itc.hoseo.spring.blah.team.TeamMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TeamTest {
	
	@Autowired
	private TeamMapper teamMapper;
	
	@Autowired
	private CommentMapper commentMapper;
	
	@Test
	public void contextLoads() {
		assertEquals(1, teamMapper.getTeams().size());
		assertEquals(2, commentMapper.getComments(1).size());
	}

}
