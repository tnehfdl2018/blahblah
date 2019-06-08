package itc.hoseo.spring.blah.team;

import java.util.List;

public interface TeamService {

	public List<Team> getTeams();

	public List<Team> findTeams(Team t);

	public List<Team> findNearTeams(Position loc);
	
	public boolean addTeam(Team t);

	public boolean updateTeam(Team t);

	public boolean deleteTeam(Team t);
	
	public int getTeamClickCnts(Team t);
}
