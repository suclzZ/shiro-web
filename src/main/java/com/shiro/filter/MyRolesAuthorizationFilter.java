package com.shiro.filter;


import java.io.IOException;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authz.AuthorizationFilter;


/**
 * Filter that allows access if the current user has the roles specified by the mapped value, or denies access
 * if the user does not have all of the roles specified.
 *
 * @since 0.9
 */
public class MyRolesAuthorizationFilter extends AuthorizationFilter {

    public boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) throws IOException {

        Subject subject = getSubject(request, response);
        String[] rolesArray = (String[]) mappedValue;

        if (rolesArray == null || rolesArray.length == 0) {
            //no roles specified, so nothing to check - allow access.
            return true;
        }else{
        	for(String role:rolesArray){
        		if(subject.hasRole(role)){
        			return true;
        		}
        	}
        }
        
        return false;
    }

}
