package itc.hoseo.spring.blah.comment;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Comment {
	private String teamNameKr;
	private String subject;
	private String writer;
	private String content;
	private Date wrtrDttm;
}
