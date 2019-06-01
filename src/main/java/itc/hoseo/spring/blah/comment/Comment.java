package itc.hoseo.spring.blah.comment;

import java.util.Date;

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
	private String teamNameKr;
	private String subject;
	private String writer;
	private String content;
	private Date wrtrDttm;
}
