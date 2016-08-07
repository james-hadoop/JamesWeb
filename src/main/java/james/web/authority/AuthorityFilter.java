package james.web.authority;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author 作者
 * @date 2016年6月29日 下午12:13:18
 */
public class AuthorityFilter implements Filter {
    @Override
    public void init(FilterConfig var1) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest var1, ServletResponse var2, FilterChain var3) throws IOException, ServletException {

    }

    @Override
    public void destroy() {

    }

//    private String defaultPage = "/index_page";
//    private String excludedUrls;
//    private String[] excludedUrlParts;
//
//    @Override
//    public void destroy() {
//
//    }
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
//        HttpServletRequest request = (HttpServletRequest) servletRequest;
//        HttpServletResponse response = (HttpServletResponse) servletResponse;
//
//        String currentURL = request.getRequestURI();
//       /* boolean isGoon = false;
//        for (String urlPart : excludedUrlParts) {
//            if (currentURL.contains(urlPart)) {
//                isGoon = true;
//                break;
//            }
//        }
//
//        if (isGoon) {
//            chain.doFilter(request, response);
//        }*/
//
//        String targetURL = currentURL.substring(currentURL.indexOf("/", 1) + 1, currentURL.length());
//
//        ServletContext servletContext = request.getSession().getServletContext();
//        WebApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(servletContext);
//        DataUsersServiceImpl dataUsersService = ctx.getBean(DataUsersServiceImpl.class);
//
//        boolean ret = false;
//
//        DataUsers user = CurrentDataUser.getUser();
//        if (user == null) {
//            response.sendRedirect(request.getContextPath() + defaultPage);
//            return;
//        }
//
//        List<DataUsers> listDataUser = dataUsersService.getUsersAllInfoByUserId(user.getId());
//
//        ret = isAccessable(targetURL, listDataUser);
//        if (false == ret) {
//            response.sendRedirect(request.getContextPath() + defaultPage);
//            return;
//        }
//
//        chain.doFilter(request, response);
//    }
//
//    @Override
//    public void init(FilterConfig arg0) throws ServletException {
//        excludedUrls = arg0.getInitParameter("excludedUrls");
//        if (excludedUrls != null && !excludedUrls.trim().equalsIgnoreCase("")) {
//            this.setExcludedUrlParts(excludedUrls.split(","));
//        }
//    }
//
//    private boolean isAccessable(String targetUrl, List<DataUsers> listDataUser) {
//        boolean ret = false;
//
//        if (null == targetUrl || 0 == targetUrl.length() || null == listDataUser || 0 == listDataUser.size()) {
//            return ret;
//        }
//
//        List<DataUserModulePage> listUserModulePage = listDataUser.get(0).getUserInfoList();
//        if (null == listUserModulePage || 0 == listUserModulePage.size()) {
//            return ret;
//        }
//
//        for (DataUserModulePage dump : listUserModulePage) {
//            if (targetUrl.equals(dump.getPageUrl())) {
//                ret = true;
//                break;
//            }
//        }
//
//        return ret;
//    }
//
//    public String getExcludedUrls() {
//        return excludedUrls;
//    }
//
//    public void setExcludedUrls(String excludedUrls) {
//        this.excludedUrls = excludedUrls;
//    }
//
//    public String[] getExcludedUrlParts() {
//        return excludedUrlParts;
//    }
//
//    public void setExcludedUrlParts(String[] excludedUrlParts) {
//        this.excludedUrlParts = excludedUrlParts;
//    }
}
