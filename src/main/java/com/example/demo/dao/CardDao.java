package com.example.demo.dao;

import com.example.demo.entity.Card;
import com.example.demo.entity.Course;
import com.example.demo.entity.User;
import lombok.Data;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
@Data
public class CardDao {
    public List<Card> getCards(){
        Card[] cards={
                new Card("1.png","别让「每天 XX 分钟」吓到你，习惯养成其实可以很简单：Continuo | App+1","如果你在养成习惯的过程中也感受到了无形的压力，那么不妨试试这款无需设定目标的 Continuo，帮助你在改变的同时减轻焦虑。"),
                new Card("2.png","工作日让家中电脑不再闲置，其实你可以遥控它做很多事","如果打个小算盘你就会发现家中电脑的利用率低到令人发指的地步，那么怎么才能在工作日的时候让家中的电脑也能被充分利用起来呢？"),
                new Card("3.jpg","Chrome 在 10 周年之际发布了新版，除了好看还更安全","Google 在 Chrome 十周年之际向全平台推送了 Chrome 69 正式版的更新，为我们带来了采用全新设计的 Google material theme 主题，同时还新增了许多新功能，特别在安全性方面做出了很大的提升。"),
                new Card("3.png","他们做了这款 Kindle 标注管理工具，想为你带来更多读书的价值：专访 Knotes | 幕后","Knotes 由在美国工作的国人贺乙钊和鲁周行共同打造，前者负责软件开发，后者负责产品设计。本期幕后我们就请到了 Knotes 团队的 2 位，一起聊了聊 Knotes 的计划以及他们对美国科技行业和读书这件事的看法。"),
                new Card("7.jpg","除了课本，你还可以在这些 App 中「涨姿势」","正值开学季，我为你们收集了一些应用，希望能让你无论在校园内外，都能再体验一次知识的趣味。")
        };
        List<Card> cardList= Arrays.asList(cards);
        return cardList;
    }
        public User getUser(){
            User user=new User();
            user.setName("sheng");
            user.setAvatar("5.png");
            return user;
        }
    public List<Course> getCourses(){
        Course[] courses={
                new Course("1.jpg","超凡羽毛球队欢迎你"),
                new Course("2.jpg","NRS面向神经元定向康复体系"),
                new Course("3.jpg","行业报告"),
                new Course("6.jpg","乔丹篮球会招新了")
        };
        List<Course> courseList= Arrays.asList(courses);
        return courseList;
    }

}
