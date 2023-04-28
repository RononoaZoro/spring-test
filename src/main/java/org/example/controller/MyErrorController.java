//package org.example;
//
//import com.akulaku.platform.components.base.util.domain.ApiResult;
//import org.springframework.boot.web.servlet.error.ErrorController;
//import org.springframework.http.HttpStatus;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// * @author : archer
// * @date : Created in 2023/4/24 11:54
// * @description :
// */
//@RestController
//public class MyErrorController implements ErrorController {
//
//    @RequestMapping(ERROR_PATH)
//    public ApiResult handleError(HttpServletRequest request, HttpServletResponse response, Model model) {
//        // 获取错误信息
//        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
//        if (status != null) {
//            Integer statusCode = Integer.valueOf(status.toString());
//            if (statusCode == HttpStatus.NOT_FOUND.value()) {
//                return "error/404";
//            }
//        }
//        return "error";
//    }
//
//    @Override
//    public String getErrorPath() {
//        return null;
//    }
//}
