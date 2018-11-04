package reporting;

public abstract class ReportFormatter {
	private String formattedValue;
	
	public ReportFormatter(Object object, FormatType formatType) {
		switch(formatType) {
		case XML:
			formattedValue = convertObjectToXML(object);
			break;
		case CSV :
			formattedValue = convertObjectToCSV(object);
		}
	}
	
	private String convertObjectToXML(Object object) {
		return "XML: <title>" + object.toString() + "<\title>";
	}
	
	private String convertObjectToCSV(Object object) {	
		return object.toString();
	}
	
	public String getFormattedValue() {
		return formattedValue;
	}

}
