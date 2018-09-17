package com.example.demo.Controller;

import com.example.demo.dao.CardDao;
import com.example.demo.dao.CourseDao;
import com.example.demo.entity.Card;
import com.example.demo.entity.Course;
import com.example.demo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class CardController {
    @Resource
    private CardDao cardDao;
    @GetMapping("card")
    public String getAll(ModelMap map){
        List<Card> cardList=cardDao.getCards();
        User user=cardDao.getUser();
        List<Course> courseList=cardDao.getCourses();
        map.addAttribute("courseList",courseList);
        map.addAttribute("cardList",cardList);
        map.addAttribute("user",user);
        return "card";
    }
}
