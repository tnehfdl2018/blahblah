package itc.hoseo.spring.blah;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.common.collect.ImmutableList;

import itc.hoseo.spring.blah.team.Position;
import itc.hoseo.spring.blah.team.Team;
import itc.hoseo.spring.blah.team.TeamMapper;

@Controller
public class MainController {

	@Autowired
	private TeamMapper teamMapper;

	@RequestMapping("/")
	public String getTeams(ModelMap m) {
		
		
		List<Team> teams = ImmutableList.of(
				Team.builder().teamNameEn("Kiaaaaaaaaaaaaa").teamNameKr("키아 주모").build(),
				Team.builder().teamNameEn("Hyunnnnnnnnn").teamNameKr("횬다이").build(),
				Team.builder().teamNameEn("skkkkkkkkkk").teamNameKr("스크으").build());
		m.put("teams", teams);
		return "index";
	}
	
	@RequestMapping("/team_about.html")
	public String getTeamsAbout(ModelMap m) {
		
		
		List<Team> teams = ImmutableList.of(
				Team.builder().teamNameEn("Kiaaaaaaaaaaaaa").teamNameKr("키아 주모").build(),
				Team.builder().teamNameEn("Hyunnnnnnnnn").teamNameKr("횬다이").build(),
				Team.builder().teamNameEn("skkkkkkkkkk").teamNameKr("스크으").build());
		m.put("teams", teams);
		return "team_about";
	}
	
	@RequestMapping("/kiaaaaaaaaaaaa.html")
	public String getTeams2(ModelMap m) {
		
		
		List<Team> teams = ImmutableList.of(
				Team.builder().teamNameEn("Kiaaaaaaaaaaaaa").teamNameKr("키아 주모").build(),
				Team.builder().teamNameEn("Hyunnnnnnnnn").teamNameKr("횬다이").build(),
				Team.builder().teamNameEn("skkkkkkkkkk").teamNameKr("스크으").build());
		m.put("teams", teams);
		return "contact";
	}
	
	@RequestMapping("/nearTeam")
	@ResponseBody
	public Team getNearTeam(@RequestBody Position pos) {
		//TODO :: 받은 좌표에서 가장 근처에 팀을 구하는 로직
		
		
		
		return Team.builder().teamNameEn("Kiaaaaaaaaaaaaa").teamNameKr("횬다이").build();
	}
	
}
