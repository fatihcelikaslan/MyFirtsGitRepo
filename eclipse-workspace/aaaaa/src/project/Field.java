package project;

class Field {
	private String label = "Undefined";
	private Object value = "";
	private Object defaultValue = "undefined";
	
	int labelDisplayLength = 20;       int valueDisplayLength = 30;
	
	static void nOf(String str, int nTimes) { StringBuilder sb = new StringBuilder();
	for (int i = 0; i < nTimes; i++) {
		sb.append(str);
		
	}
	}
	
	Field(String label) {  this.label = label;}

	void setValue(Object value) {  this.value = value;  }

	void setDefaultValue(Object defaultValue) {this.defaultValue = defaultValue;}

	String getLabel() {return label;}

	String getValue() {	return ""; }

	String getDefaultValue() {return defaultValue.toString();}

	String getType() {return "Field";}

	String getFieldDefinition() {
		return getType() + "[" + "label=" + getLabel() + ", default_value=" + getDefaultValue() + ", value= "+ getValue() + "]";}}

class TextField extends Field {  TextField(String label) {	super(label);}
	
	String getType() {	return "TextField";}  }

class EmailField extends TextField {   EmailField(String label) {super(label);}
	
	String getType() {return "EmailField";}}

class PasswordField extends TextField {PasswordField(String label) {	super(label);}
	
	String getType() {	return "PasswordField";	}}

class NumberField extends Field {
	NumberField(String label) {
		super(label);
	}
	
	String getType() {
		return "NumberField";
	}

}

class PhoneField extends NumberField {
	PhoneField(String label) {
		super(label);
	}
	
	String getType() {
		return "PhoneField";
	}
}

class PercentField extends NumberField {
	PercentField(String label) {
		super(label);
	}
	
	String getType() {
		return "PercentField";
	}
}