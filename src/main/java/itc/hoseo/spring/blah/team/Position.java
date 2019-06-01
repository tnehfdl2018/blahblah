package itc.hoseo.spring.blah.team;

import lombok.Data;

@Data
public class Position {
	private int accuracy;
	private String altitude;
	private String altitudeAccuracy;
	private String heading;
	double latitude;
	double longitude;
	private String speed;
}
