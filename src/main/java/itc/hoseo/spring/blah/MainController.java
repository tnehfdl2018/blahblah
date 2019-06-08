package itc.hoseo.spring.blah;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.common.collect.ImmutableList;

import itc.hoseo.spring.blah.comment.CommentService;
import itc.hoseo.spring.blah.team.Position;
import itc.hoseo.spring.blah.team.Team;
import itc.hoseo.spring.blah.team.TeamMapper;
import itc.hoseo.spring.blah.team.TeamService;

@Controller
public class MainController {
	@Autowired
	private TeamService teamService;
	@org.springframework.beans.factory.annotation.Autowired(required=true)
	private CommentService commentService;

	@RequestMapping("/")
	public String index(ModelMap m) {
		m.put("pikachu", teamService.getTeams());
		return "index";
	}

	@RequestMapping("/team_about.html")
	public String getTeamsAbout(ModelMap m) {

		List<Team> teams = ImmutableList.of(Team.builder().teamNameEn("Kiaaaaaaaaaaaaa").teamNameKr("키아 주모").build(),
				Team.builder().teamNameEn("Hyunnnnnnnnn").teamNameKr("횬다이").build(),
				Team.builder().teamNameEn("skkkkkkkkkk").teamNameKr("스크으").build());
		m.put("teams", teams);
		return "team_about";
	}

	@RequestMapping("/about2.html")
	public String getTeams2(ModelMap m) {

		List<Team> teams = ImmutableList.of(Team.builder().teamNameEn("Kiaaaaaaaaaaaaa").teamNameKr("키아 주모").build(),
				Team.builder().teamNameEn("Hyunnnnnnnnn").teamNameKr("횬다이").build(),
				Team.builder().teamNameEn("skkkkkkkkkk").teamNameKr("스크으").build());
		m.put("teams", teams);
		return "contact";
	}

	@RequestMapping("/nearTeam")
	@ResponseBody
	public List<Team> getNearTeam(@RequestBody Position pos) {
		return teamService.findNearTeams(pos);
	}
	
	@RequestMapping("/about-3.html")
	public String comment(ModelMap m) {
		m.put("pairy", commentService.getComments());
		return "about-3";
	}

}
