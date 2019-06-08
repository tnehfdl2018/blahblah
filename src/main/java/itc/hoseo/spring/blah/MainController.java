package itc.hoseo.spring.blah;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.common.collect.ImmutableList;

import itc.hoseo.spring.blah.comment.Comment;
import itc.hoseo.spring.blah.comment.CommentService;
import itc.hoseo.spring.blah.team.Position;
import itc.hoseo.spring.blah.team.Team;
import itc.hoseo.spring.blah.team.TeamService;

@Controller
public class MainController {
	@Autowired
	private TeamService teamService;
	
	@Autowired
	private CommentService commentService;

	@RequestMapping("/")
	public String index(ModelMap m) {
		m.put("pikachu", teamService.getTeams());
		return "index";
	}

	@RequestMapping("/team_about")
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
	
	
	
	@PostMapping("/comment")
	public String comment(Comment c) {
		c.setWrtrDttm(new Date());
		commentService.addComment(c);
		return "redirect:comment";
	}
	
	@RequestMapping("/comment")
	public String comment(ModelMap m, Comment c) {
		if(c != null) {
			m.put("commentList", commentService.findComments(c));
		}else {
			m.put("commentList", commentService.getComments());
		}
		
		return "pikapika";
	}

}
