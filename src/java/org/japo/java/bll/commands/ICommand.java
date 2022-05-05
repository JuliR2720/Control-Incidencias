package org.japo.java.bll.commands;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Julian David Ramos Gómez <juli12319@hotmail.com>
 */
public interface ICommand {

    void init(ServletConfig config,
            HttpServletRequest request,
            HttpServletResponse response);

    void process() throws ServletException, IOException;
}
