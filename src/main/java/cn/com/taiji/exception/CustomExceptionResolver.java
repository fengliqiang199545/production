package cn.com.taiji.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CustomExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handle, Exception ex) {

        /**
         * 前端控制器DispatcherServlet在进行HandlerMapping、调用HandlerAdapter执行Handler过程中，如果遇到异常就会执行此方法
         * handler最终要执行的Handler，它的真实身份是HandlerMethod
         * Exception ex就是接收到异常信息
         */

        //输出异常
        ex.printStackTrace();

        //统一异常处理代码
        //针对系统自定义的CustomException异常，就可以直接从异常类中获取异常信息，将异常处理在错误页面展示
        //异常信息

        String message = null;
        CustomException customException = null;

        //接下来对ex的异常类型和异常数据进行解析并返回相关的数据和页面

        //ex如果是系统自定义异常
        if (ex instanceof CustomException){
            //直接进行强转，然后调用CustomException的相关方法
            customException = (CustomException) ex;
        }else{
            //如果不是系统的自定义异常，则创建为未知错误
            customException = new CustomException("未知错误");

        }

        //错误信息
        message = customException.getMessage();

        httpServletRequest.setAttribute("message",message);

        //转向到错误的页面
        try {
            httpServletRequest.getRequestDispatcher("/error.jsp").forward(httpServletRequest,httpServletResponse);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new ModelAndView();
    }
}
