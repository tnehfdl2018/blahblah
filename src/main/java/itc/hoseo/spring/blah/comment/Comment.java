package itc.hoseo.spring.blah.comment;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.util.StringUtils;

import itc.hoseo.spring.blah.comment.Comment.CommentBuilder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Comment {
	private int commentNum;
	private String teamNameKr;
	private String subject;
	private String writer;
	private String content;
	private Date wrtrDttm;
	
}
