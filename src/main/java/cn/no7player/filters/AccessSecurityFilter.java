package cn.no7player.filters;

import cn.no7player.utils.L;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Huan on 2017/2/8.
 */
public class AccessSecurityFilter extends HandlerInterceptorAdapter {

    private String gihre = "http://localhost";


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String servletPath = request.getServletPath();
        String contextPath = request.getContextPath();
        String remoteAddr = request.getRemoteAddr();
        String requestedSessionId = request.getRequestedSessionId();
        String requestURI = request.getRequestURI();
        String requestURL = request.getRequestURL().toString();
        String pathInfo = request.getPathInfo();
        String method = request.getMethod();
        L.w("servletPath=" + servletPath + ",\n" +
                "contextPath=" + contextPath + ";\n" +
                "remoteAddr=" + remoteAddr + ",\n" +
                "requestedSessionId=" + requestedSessionId + ";\n" +
                "requestURI=" + requestURI + ";\n" +
                "requestURL=" + requestURL + ";\n" +
                "method=" + method + ";\n" +
                "pathInfo=" + pathInfo);

        try {
            if (remoteAddr.equals("0:0:0:0:0:0:0:1")) {
                L.w("正常的本地访问");
                return super.preHandle(request, response, handler);
            }
            String[] strings = remoteAddr.split("");
            for (int i = 0; i < strings.length; i++) {
                if (strings[i].matches("[a-zA-z]")) {
                    L.w("正常的域名访问");
                    return super.preHandle(request, response, handler);
                }
            }
            L.w("非法的IP访问");
            return false;
        } catch (Exception e) {

        }
        return super.preHandle(request, response, handler);
    }

        @Override
        public void postHandle (HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView
        modelAndView) throws Exception {
            super.postHandle(request, response, handler, modelAndView);
        }

        @Override
        public void afterCompletion (HttpServletRequest request, HttpServletResponse response, Object handler, Exception
        ex) throws Exception {
            super.afterCompletion(request, response, handler, ex);

        }


    }
