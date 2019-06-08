package itc.hoseo.spring.blah.team;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamServiceImpl implements TeamService{
	
	@Autowired
	private TeamMapper mapper;
	private Map<Team, Integer> cntMap = new HashMap<>();
	
	@Override
	public List<Team> getTeams() {
		return mapper.getTeams();
	}
	
	@PostConstruct
	public void richu() {
		for(Team tm : mapper.getTeams()) {
			cntMap.put(tm, 0);
		}
	}

	@Override
	public List<Team> findTeams(Team t) {
		List<Team> list = mapper.findTeams(t);
		for(Team tm : list) {
			cntMap.put(tm, cntMap.get(tm) + 1);
		}
		return list;
	}

	@Override
	public boolean addTeam(Team t) {
		return mapper.addTeam(t) == 1 ? true : false;
	}

	@Override
	public boolean updateTeam(Team t) {
		return mapper.updateTeam(t) == 1 ? true : false;
	}

	@Override
	public boolean deleteTeam(Team t) {
		return mapper.deleteTeam(t) == 1 ? true : false;
	}

	@Override
	public List<Team> findNearTeams(Position pos) {
		// FIXME :: 좌표를 이용해서 가장 가까운 팀 목록을 가져온다
		return mapper.getTeams();
	}

	@Override
	public int getTeamClickCnts(Team t) {
		return cntMap.get(t);
	}

}
