package com.odinrossy.pismlab1.controllers;

import com.odinrossy.pismlab1.services.NumbersService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Lab1Servlet", urlPatterns = "/numbers")
public class Lab1Servlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String message;
        try {
            String[] stringNumbers = request.getParameterValues("num");
            int countOfNumbers = stringNumbers.length;
            if (countOfNumbers > 0) {
                double[] doubleNumbers = new double[countOfNumbers];
                for (int i = 0; i < countOfNumbers; i++) {
                    doubleNumbers[i] = Double.parseDouble(stringNumbers[i]);
                }
                message = new NumbersService().generateMessage(doubleNumbers);
            } else
                throw new RuntimeException("Вы не ввели число");
        } catch (Exception e) {
            message = e.toString();
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, e.getLocalizedMessage());
        }
        request.setAttribute("message", message);
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}
