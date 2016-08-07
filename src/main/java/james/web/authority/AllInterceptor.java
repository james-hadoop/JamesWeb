package james.web.authority;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequestInterceptor;

public class AllInterceptor implements WebRequestInterceptor {

    @Override
    public void preHandle(WebRequest request) throws Exception {
        System.out.println("AllInterceptor.preHandle()");
    }

    @Override
    public void postHandle(WebRequest request, ModelMap model) throws Exception {
        // System.out.println("AllInterceptor.postHandle()");
    }

    @Override
    public void afterCompletion(WebRequest request, Exception ex) throws Exception {
        // System.out.println("AllInterceptor.afterCompletion()");
    }
}
