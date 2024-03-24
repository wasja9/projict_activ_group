package ALL.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
//import  ALL.dao.*;


//@Controller
@RestController
public class UsersControllerSimple {
@Autowired
//private UsersDao usersDao;

    UsersControllerSimple(){System.out.println("HELLO constructor!!! us_SM");};

    @RequestMapping(path = "/us_SM", method=RequestMethod.GET)

    public  ModelAndView getAllUsers1() {
        System.out.println("HELLO!!! us_SM");
        return null;

        //List<ALL.models.us> us = usersDao.findAll();//Вытягиваем данные в список
       // ModelAndView modelAndView = new ModelAndView();//Экземпляр вюшки
       // modelAndView.setViewName("us_SM");//Имя вызываемой страницы
      //  modelAndView.addObject("userFromServer", us);//Передаем данные в страницу
        //return modelAndView; //Запустить отображение вюшки
//

    }

/*
    @PostMapping("/fill")
    public ResponseEntity<Object> addFile(//@RequestBody MultipartFile file
                                          @RequestParam String token,//получаем токен
                                          @RequestParam String idbr,
                                          @RequestParam String idpr,
                                          @RequestParam String name_fl,
                                          @RequestParam ("file") MultipartFile file
    ) {
        filService.writeFL(file,idbr,idpr,token,name_fl);

        return null;
    }
*/

    // @RequestMapping(path = "/us_", method=RequestMethod.POST)

    // public  ModelAndView getAllUsers11() {
    //    System.out.println("HELLO!!!");
    //    return null;
    //}

   // @GetMapping("/HW")
  //public  String sayHello() {//return "Hello WORLD";
   //     System.out.println("HELLO!!!");
   // return null;
   // }
};


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
};
 */
