package itc.hoseo.spring.blah;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.activation.CommandMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.common.collect.ImmutableList;

import itc.hoseo.spring.blah.comment.Comment;
import itc.hoseo.spring.blah.comment.CommentService;
import itc.hoseo.spring.blah.team.Position;
import itc.hoseo.spring.blah.team.Team;
import itc.hoseo.spring.blah.team.TeamMapper;
import itc.hoseo.spring.blah.team.TeamService;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class MainController {
   @Autowired
   private TeamService teamService;
   @Autowired
   private CommentService commentService;

   @RequestMapping("/")
   public String index(ModelMap m) {
      m.put("pikachu", teamService.getTeams());
      return "index";
   }

   @RequestMapping("/team_about.html")
   public String getTeamsAbout(ModelMap m) {

      List<Team> teams = ImmutableList.of(Team.builder().teamNameEn("Kiaaaaaaaaaaaaa").teamNameKr("키아 주모").build(),
            Team.builder().teamNameEn("Hyunnnnnnnnn").teamNameKr("횬다이").build(),
            Team.builder().teamNameEn("skkkkkkkkkk").teamNameKr("스크으").build());
      m.put("teams", teams);
      return "team_about";
   }

   @RequestMapping("/about2.html")
   public String getTeams2(ModelMap m) {

      List<Team> teams = ImmutableList.of(Team.builder().teamNameEn("Kiaaaaaaaaaaaaa").teamNameKr("키아 주모").build(),
            Team.builder().teamNameEn("Hyunnnnnnnnn").teamNameKr("횬다이").build(),
            Team.builder().teamNameEn("skkkkkkkkkk").teamNameKr("스크으").build());
      m.put("teams", teams);
      return "contact";
   }

   @RequestMapping("/nearTeam")
   @ResponseBody
   public List<Team> getNearTeam(@RequestBody Position pos) {
      return teamService.findNearTeams(pos);
   }
   
   
   @RequestMapping(path = "comment",method = RequestMethod.GET, name = "get")
   public String comment(ModelMap m, Comment cmt) {
      m.put("pairy", commentService.findComments(cmt));
      System.out.println(m.put("pairy", commentService.findComments(cmt)));
      return "comment";
   }
   
   
   @RequestMapping(path = "write", method = RequestMethod.POST, name = "write")
   public String saveComment(Comment cmt ,ModelMap m) {
      cmt.setWrtrDttm(new Date());
      commentService.addComment(cmt);      
      return "redirect:comment";
   }
   
   @RequestMapping(path = "modify")
   public String modifyComment(Comment cmt) {
	   commentService.updateComment(cmt);
	   return "redirect:comment";
   }
   
   @RequestMapping(path = "delete")
   public String deleteComment(Comment cmt) {
      commentService.deleteComment(cmt);
      return "redirect:comment";
   }  
   
   
///////////////////////////////////////////////////////////////////////////////////////////////////
   
//   페이지 이동
   @RequestMapping(path = "reModify")
   public String reModifyComment() {
	   return "modify";
   }
   
   @RequestMapping(path = "add")
   public String addComment() {
	   return "add";
   }
 
///////////////////////////////////////////////////////////////////////////////////////////////////
   
//	상세 페이지   
   @RequestMapping(path = "detail", name = "get")
   public String detailComment(@RequestParam("commentNum") int commentNum, ModelMap m, Comment cmt) {
	   System.out.println("dddd");
	   System.out.println(commentNum);
	   System.out.println( m.put("detailView", commentService.findComments(cmt)));
      m.put("detailView", commentService.detailComment(commentNum));
      return "detail";
   }

}