package com.example.medicinemanagerdemo.controller;

import org.springframework.stereotype.Controller;

@Controller
public class LoginController {
//    @Autowired
//    private LoginService userService;
//
//    @GetMapping("/login")
//    public ModelAndView login() {
//        ModelAndView mav = new ModelAndView("user");
//        mav.addObject("user", new Login());
//        return mav;
//    }
//
//    @PostMapping("/login")
//    public String login(@ModelAttribute("user") Login user ) {
//
//        Login authUser = userService.login(user.getUsername(), user.getPassword());
//
//        System.out.print(authUser);
//        if(Objects.nonNull(authUser))
//        {
//            return "redirect:/";
//
//        } else {
//            return "redirect:/login";
//
//
//        }
//    }
//
//    @RequestMapping(value = {"/logout"}, method = RequestMethod.POST)
//    public String logoutDo(HttpServletRequest request, HttpServletResponse response)
//    {
//
//        return "redirect:/login";
//    }
}
