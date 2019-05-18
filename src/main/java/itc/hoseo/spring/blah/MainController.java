package itc.hoseo.spring.blah;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import itc.hoseo.spring.blah.team.Team;
import itc.hoseo.spring.blah.team.TeamMapper;

@Controller
public class MainController {

	@Autowired
	private TeamMapper teamMapper;
	
	@ResponseBody
	@RequestMapping("/teams")
	public List<Team> getTeams() {
		return teamMapper.getTeams();
	}
}
