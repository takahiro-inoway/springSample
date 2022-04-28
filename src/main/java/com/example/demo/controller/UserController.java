package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

/**
 * ���[�U�[��� Controller
 */
@Controller
public class UserController {

  /**
   * ���[�U�[��� Service
   */
  @Autowired
  UserService userService;

  /**
   * ���[�U�[���ꗗ��ʂ�\��
   * @param model Model
   * @return ���[�U�[���ꗗ��ʂ�HTML
   */
  @RequestMapping(value = "/user/list", method = RequestMethod.GET)
  public String displayList(Model model) {
    List<User> userlist = userService.searchAll();
    System.out.print(userlist);
    model.addAttribute("userlist", userlist);
    model.addAttribute("teststr", "teststr!");
    return "user/list";
  }
}