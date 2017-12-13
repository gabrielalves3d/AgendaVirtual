package br.edu.ifpe.av.controller.util;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class AgendamentoJob implements Job {

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		System.out.println("Executando Job");
		
		/** public void execute(JobExecutionContext arg0) throws JobExecutionException {
		 
			 final List<String> comandos = new ArrayList<String>();  
			 comandos.add("sudo");
			 comandos.add(dumpCommand); 
	         ProcessBuilder pb = new ProcessBuilder(comandos);    
	         
	         try {      
	        	 File f = new File(redirectOutput);
	             f.createNewFile();
	             pb.redirectError(f);
	        	 LoggerPTD.getLoggerInstance().logInfo("Start " + dumpCommand);
	             final Process process = pb.start();                
	             int exitCode = process.waitFor();    
	             process.destroy(); 
	             LoggerPTD.getLoggerInstance().logInfo("Finish " + dumpCommand + ": Exit code: " + exitCode);
	         } catch (IOException e) {      
	        	 LoggerPTD.getLoggerInstance().logError(e.getMessage());  
	         } catch (InterruptedException ie) {      
	        	 LoggerPTD.getLoggerInstance().logError(ie.getMessage()); 
	         }
		}*/
		

	}

}
