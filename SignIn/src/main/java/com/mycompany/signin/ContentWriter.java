/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.signin;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andrew
 */
public class ContentWriter 
{
    public void writeContent(WebPost wp, String filepath)
    {
        try 
        {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filepath, true));
            writer.write("\n" + wp.writeFormat());
            writer.close();
        }
        
        catch (IOException ex) 
        {
            // left blank intentionally to hide details from the user
            //Logger.getLogger(ContentWriter.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
