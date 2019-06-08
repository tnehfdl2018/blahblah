package itc.hoseo.spring.blah.team;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Mapper
@Primary
public interface TeamMapper {
	public List<Team> getTeams();

	public List<Team> findTeams(Team t);

	public int addTeam(Team t);

	public int updateTeam(Team t);

	public int deleteTeam(Team t);
}
