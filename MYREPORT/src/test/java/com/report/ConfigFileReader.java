package com.report;
import java.io.InputStream;
import java.util.Properties;

public class ConfigFileReader 
{
	public String getReportConfigPath()
	{
 Properties properties = new Properties();
	    InputStream input = null;
	    try
    {
	    	properties.load(getClass().getClassLoader().getResourceAsStream(".//config/config.properties"));
	        String reportConfigPath = properties.getProperty("reportConfigPath");
        if(reportConfigPath!= null) return reportConfigPath;
	        else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");        

	    }
	    catch (Exception io) 
		{
	        io.printStackTrace();
	    }	    finally {
	        if (input != null) {
	            try {
	                input.close();
	            } 
	            catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	    }    
    return null;
	}
		
}

