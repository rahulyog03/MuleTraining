package com.hsbc;

import java.util.HashMap;
public class CustEmployeeProcessor {
    
    public CustEmployeeProcessor() {
        System.out.println("CustEmployeeProcessor.CustEmployeeProcessor()");
    }
    
    public HashMap<String, String> processEmpData(String payload){
        
        String[] elements=payload.split("-");
        
        HashMap<String, String> empData= new HashMap<String,String>();
        
        empData.put("id", elements[0]);
        empData.put("name", elements[1]);
        empData.put("salary", elements[2]);
        empData.put("enabled", elements[3]);
        
        System.out.println("CustEmployeeProcessor.processEmpData()");
        
        return empData;
    }  
    
}