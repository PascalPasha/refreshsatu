/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.refresh.refreshing.ptsatu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author pascal
 */

@Controller
public class projectController {
    @RequestMapping("/views")
    public String getTampilan(Model model){
        model.addAttribute("nama", "Hello World");
        return "view";
    }
    
}
