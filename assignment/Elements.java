package assignment;

public class Elements extends Button {

	public static void main(String[] args) {

		System.out.println("**************TextField methods:**************");
		TextField textFieldObj = new TextField();
	
		textFieldObj.click();
		textFieldObj.setText("TextField");
	
		textFieldObj.getText();
		
		System.out.println("**************Button methods:**************");
		Button buttonObj = new Button();
		
		buttonObj.click();
		buttonObj.setText("Button");
		
		buttonObj.submit();

		System.out.println("**************CheckBoxButton methods:**************");
		CheckBoxButton checkBoxButtonObj = new CheckBoxButton();
		
		checkBoxButtonObj.click();
		checkBoxButtonObj.setText("CheckBoxButton");
	
		checkBoxButtonObj.clickCheckButton();
		
		checkBoxButtonObj.submit();

		System.out.println("**************RadioButton methods:**************");
		RadioButton radioButtonObj = new RadioButton();
		
		radioButtonObj.click();
		radioButtonObj.setText("RadioButton");
	
		radioButtonObj.selectRadioButton();
		
		radioButtonObj.submit();
		
		System.out.println("**************Elements methods:**************");
		Elements elementObj = new Elements();
		
		elementObj.click();
		elementObj.setText("Elements");
	
		elementObj.submit();

	}


}
