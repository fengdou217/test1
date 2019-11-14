import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MyInterceptor extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        String output = "Pre-Processing";
        System.out.println(output);
        // 实际中action通过拦截器使用actionInvocation.invoke()调用执行
        String result = actionInvocation.invoke();
        output = "Post-Processing";
        System.out.println(output);
        return result;
    }
}
