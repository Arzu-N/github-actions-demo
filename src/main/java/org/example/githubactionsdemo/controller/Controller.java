package org.example.githubactionsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller
{
    @GetMapping("/")
    public String sayHello(){
        return "Hello Github actions";
    }
    @GetMapping("/say")
    public int[] say(){
        int[]arr=new int[10];
        for(int i=0;i<10;i++){
          arr[i]=i;
        }
        return arr;
    }
}
