package batch;
import java.time.*;

public class Batch {
	
	private int batchId;
	private String batchName;
	private String module;
	private String location;
	private LocalDate startDate;
	
	
	public Batch() {
		
	}


	public Batch(int batchId, String batchName, String module, String location,LocalDate startDate) {
		
		this.batchId = batchId;
		this.batchName = batchName;
		this.module = module;
		this.location = location;
		this.startDate=startDate;
	}
	
	public void displayBatchInfo() {
		System.out.println("Batch Id: "+batchId);
		System.out.println("Batch Name: "+batchName);
		System.out.println("Batch Module: "+module);
		System.out.println("Batch Location: "+location);
		System.out.println("Start Date: "+startDate);
	}
	
	
	
	

}
