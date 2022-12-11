/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author nuwan
 */
public class Operator {

    public Operator() {
        System.out.println("Accessing Operator class");
    }
    
    public float PerformOperator(int num1, int num2, String opr){
        
        float answer = 0;
        
        if(opr == "plus"){
            answer = num1 + num2;
        }
        else if(opr == "minus"){
            answer = num1 - num2;
        }
        else if(opr == "multiply"){
            answer = num1 * num2;
        }
        else if(opr == "divide"){
            answer = num1 / num2;
        }
        
        return answer;
    }
}
