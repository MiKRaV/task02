package blinov.chapter4.a.task12;

public class Directory {
	
	private String filePath;
	
	public Directory(String filePath) {
		this.filePath = filePath;
	}
	
	public String getFilePath() {
		return filePath;
	}
	
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		
		Directory other = (Directory) obj;
		if(filePath == null) {
			if(other.filePath != null)
				return false;
		} else if(!filePath.equals(other.filePath))
			return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = result * prime + ((filePath == null) ? 0 : filePath.hashCode());
		return result;
	}
	
	@Override
	public String toString() {
		return "Directory [filePath = " + filePath + "]";
	}
}
