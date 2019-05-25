package itc.hoseo.spring.blah;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import itc.hoseo.spring.blah.team.Team;
import itc.hoseo.spring.blah.team.TeamMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TeamTest {
	
	@Autowired
	private TeamMapper teamMapper;

	
	@Test
	public void testFindTeams() {
		Team t = new Team();
		t.setTeamLastResult("1위");
		Team winTeam = teamMapper.findTeams(t).get(0);
		
		assertEquals("SK 와이번스", winTeam.getTeamNameKr());
	}
	
	@Test
	public void testGetTeams() {	
		assertEquals(10, teamMapper.getTeams().size());
	}
	
	@Test
	public void testAddTeam() {
		teamMapper.addTeam(Team.builder()
				.teamNameKr("호서 아이티즈")
				.teamNameEn("Hoseo")
				.teamYear("2019")
				.teamWin("1111")
				.teamLastResult("1111")
				.teamLoc("서울 발산동").build());
		
		assertEquals(11,teamMapper.getTeams().size());
	}

}
