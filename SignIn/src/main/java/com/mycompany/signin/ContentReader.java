/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.signin;

import java.io.BufferedReader;
import java.io.Reader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Andrew
 */
public class ContentReader 
{
    public List<WebPost> getBackwards(String filepath)
    {
        // Object to return
        List<WebPost> fileContents = new ArrayList<WebPost>();
        
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(filepath));
            String endToken = "<endPost>";
            
            String currentLine = reader.readLine();
            while(currentLine != null)
            {
                String title = currentLine;
                String author = reader.readLine();
                String date = reader.readLine();
                currentLine = reader.readLine();
                String content = "";
                
                while (!currentLine.equals(endToken))
                {
                    //System.out.println(currentLine + " != " + endToken);
                    content += currentLine;
                    content += "\n";
                    currentLine = reader.readLine();
                }
                
                WebPost wp = new WebPost(title, author, date, content);
                
                fileContents.add(wp);
                
                currentLine = reader.readLine();
            }
        }
     
        
        catch (Exception e)
        {
            // left blank intentionally to hide details from the user
        }
    
        Collections.reverse(fileContents);
        return fileContents;     
    }

    private Reader FileReader() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
