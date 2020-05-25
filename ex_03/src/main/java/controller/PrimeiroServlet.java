/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author fabricio
 */
@WebServlet(urlPatterns={"/ex_03"})
public class PrimeiroServlet extends HttpServlet{
    
    @Override
    public void doGet(HttpServletRequest req,
                      HttpServletResponse resp){
        try{
           PrintWriter pw = resp.getWriter(); 
           pw.write("Bom dia pessoal!");
        } catch(IOException ioe){
            System.out.println("Impossível escrever na resposta!"); 
        }        
    }
    
}
