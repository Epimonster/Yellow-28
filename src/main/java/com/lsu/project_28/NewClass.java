/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lsu.project_28;

/**
 *
 * @author garet
 */
public class NewClass extends testing{
    
    public String[] converter(char a){
        
    }
    
    
    
    public boolean checkeryn(char tocheck){
        if(tocheck=='y'||tocheck=='n'){
            return checksumyn(tocheck);
        }else{
            System.out.println("Please enter y or n");
        }
        return false;
    }
    
    
    public boolean checksumyn(char check){
        if(check=='y'){
            return true;
        } if(check=='n'){
            return false;
        }
        return false;
    }
    
    
    
}
