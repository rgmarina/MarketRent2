package com.example.marketrent.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorController implements org.springframework.boot.web.servlet.error.ErrorController {

    @RequestMapping("/error")
    public String handleError(HttpServletRequest request, Model model) {
        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");

        if (statusCode != null) {
            switch (statusCode) {
                case 403:
                    model.addAttribute("error", "Доступ запрещен");
                    break;
                case 404:
                    model.addAttribute("error", "Страница не найдена");
                    break;
                case 500:
                    model.addAttribute("error", "Внутренняя ошибка сервера");
                    break;
                default:
                    model.addAttribute("error", "Произошла ошибка");
            }
        }

        return "error";
    }
}