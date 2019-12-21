package com.forest.manage.web.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * 用户注册 Controller
 */
@Controller
public class UserRegisterController {

    /**
     * 静态页面这样写
     *
     * @param modelMap
     * @return
     */
    @RequestMapping("registerStatic.htm")
    public String baseRegisterPage(final Map<String, Object> modelMap) {
        modelMap.put("name", "prime7");
        modelMap.put("age", 10);
        //这个是 resource中 templates里的以html后缀的文件名
        return "register";
    }

}
