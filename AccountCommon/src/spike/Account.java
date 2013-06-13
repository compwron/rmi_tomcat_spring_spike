package spike;

import java.io.Serializable;

public class Account implements Serializable {

	private static final long serialVersionUID = -8037470854644592606L;
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}