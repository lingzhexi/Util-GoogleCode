package cn.stormling.googlecodekaptcha.control;

import cn.stormling.googlecodekaptcha.util.CodeUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: StormLing
 * @Description:
 * @Date: Created in 16:58 2020-05-06
 * @Modified By:
 */
@RestController
public class HelloWorld {
    @RequestMapping("/hello")
    public String hello(HttpServletRequest request){
        if (!CodeUtil.checkVerifyCode(request)) {
            return "验证码错误";
        }
        return "Hello World";
    }
}
