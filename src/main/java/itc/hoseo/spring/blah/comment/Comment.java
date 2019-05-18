package itc.hoseo.spring.blah.comment;

import java.util.Date;

import lombok.Data;

@Data
public class Comment {
	private int teamId;
	private String userName;
	private String content;
	private Date wrtrDttm;
}
