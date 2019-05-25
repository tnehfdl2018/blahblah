package itc.hoseo.spring.blah.team;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Team {
	private String teamNameKr;
	private String teamNameEn;
	private String teamYear;
	private String teamWin;
	private String teamLastResult;
	private String teamLoc;
}
