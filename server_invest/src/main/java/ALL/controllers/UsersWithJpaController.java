package ALL.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by asu on 08.08.2020.
 */

//РАБОЧИЙ КОНТРОЛЛЕР на BOOT
@Controller
public class UsersWithJpaController {
    @Autowired
    //private UsersRepository usersRepository;

    UsersWithJpaController(){System.out.println("HELLO constructor!!! us_BT!!!");};

    @RequestMapping(path = "/us_BT", method=RequestMethod.GET)

    public ModelAndView getUsers(){
        System.out.println("HELLO!!! us_BT");

    //    List<ALL.models.us> us = usersRepository.findAll();

        //ModelAndView modelAndView = new ModelAndView("us_BUT");//Экземпляр вюшки

       // modelAndView.addObject("userFromServer", us);//Передаем данные в страницу

        //return  modelAndView;
        return  null;
    }
}

/*
@Controller
public class UsersControllerSimple {
    @Autowired
    private UsersDao usersDao;

    @RequestMapping(path = "/us_SM", method=RequestMethod.GET)
    public  ModelAndView getAllUsers() {
        List<ALL.models.us> us = usersDao.findAll();//Вытягиваем данные в список

        ModelAndView modelAndView = new ModelAndView();//Экземпляр вюшки
        modelAndView.setViewName("us_SM");//Имя вызываемой страницы

        modelAndView.addObject("userFromServer", us);//Передаем данные в страницу
        return modelAndView; //Запустить отображение вюшки


    }
};*/
