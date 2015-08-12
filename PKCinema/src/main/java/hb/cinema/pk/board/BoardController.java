package hb.cinema.pk.board;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/boardList.do")
public class BoardController {
	
	@RequestMapping( method = RequestMethod.GET)
	 public ModelAndView execute() {
    // 반환값이 되는 ModelAndView 인스턴스를 생성
    ModelAndView modelAndView = new ModelAndView();
    System.out.println("11111111111111");
    modelAndView.setViewName("/one"); // tiles definition name

    return modelAndView;
  }
}

