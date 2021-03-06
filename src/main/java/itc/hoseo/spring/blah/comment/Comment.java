package itc.hoseo.spring.blah.comment;


import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public class Comment {
	private int commentNum;
	private String teamNameKr;
	private String subject;
	private String writer;
	private String content;
	private Timestamp date;
}
