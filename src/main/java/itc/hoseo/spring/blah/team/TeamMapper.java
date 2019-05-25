package itc.hoseo.spring.blah.team;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TeamMapper {
	public List<Team> getTeams();
	public int addTeam(Team t);
	public List<Team> findTeams(Team t);
}
