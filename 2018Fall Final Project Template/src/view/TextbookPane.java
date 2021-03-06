package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import model.TextbookBag;

public class TextbookPane {
	private static final int BUTTON_WIDTH = 120;
	private static final int BUTTON_HEIGHT = 40;
	private TextField titleField;
	private TextField isbnField;
	private TextField authorField;
	private TextField priceField;

	private GridPane textbookPane;
	private Button insertBtn;
	private Button searchBtn;
	private Button updateBtn;
	private Button deleteBtn;

	private HBox buttonBox;

//	private TextbookBag textbookBag;

	public TextbookPane() {
//		this.textbookBag = textbookBag;
		titleField = new TextField();
		titleField.setPromptText("Title");
		isbnField = new TextField();
		isbnField.setPromptText("ISBN");
		authorField = new TextField();
		authorField.setPromptText("Author");
		priceField = new TextField();
		priceField.setPromptText("Price");
			
		insertBtn = new Button("INSERT");
		insertBtn.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGHT);
		searchBtn = new Button("SEARCH");
		searchBtn.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGHT);
		updateBtn = new Button("UPDATE");
		updateBtn.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGHT);
		deleteBtn = new Button("DELETE");
		deleteBtn.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGHT);
		
		textbookPane = new GridPane();
		textbookPane.setAlignment(Pos.CENTER);
		textbookPane.setPadding(new Insets(20));
		textbookPane.setVgap(20);
		textbookPane.setHgap(20);
		buttonBox = new HBox(40);
		buttonBox.setAlignment(Pos.CENTER);
		buttonBox.getChildren().addAll(insertBtn, searchBtn, updateBtn, deleteBtn);
		buildPane();

	}

	public String getTitle() {
		return titleField.getText();
	}

	public String getIsbn() {
		return isbnField.getText();
	}

	public String getAuthor() {
		return authorField.getText();
	}

	public double getPrice() {
		return Double.parseDouble(priceField.getText());
	}

	public Button getInsertBtn() {
		return insertBtn;
	}

	public Button getSearchBtn() {
		return searchBtn;
	}

	public Button getUpdateBtn() {
		return updateBtn;
	}

	public Button getDeleteBtn() {
		return deleteBtn;
	}

	public HBox getButtonBox() {
		return buttonBox;
	}
	
//	public TextbookBag getTextbookBag() {
//		return textbookBag;
//	}

	private void buildPane() {
		textbookPane.add(titleField, 0, 0);
		textbookPane.add(isbnField, 1, 0);
		textbookPane.add(authorField, 0, 1);
		textbookPane.add(priceField, 1, 1);
		textbookPane.add(buttonBox, 0, 3, 2, 1);
	}

	public Pane getTextbookPane() {
		return textbookPane;
	}

	public TextField getTitleField() {
		return titleField;
	}

	public void setTitleField(TextField titleField) {
		this.titleField = titleField;
	}

	public TextField getIsbnField() {
		return isbnField;
	}

	public void setIsbnField(TextField isbnField) {
		this.isbnField = isbnField;
	}

	public TextField getAuthorField() {
		return authorField;
	}

	public void setAuthorField(TextField authorField) {
		this.authorField = authorField;
	}

	public TextField getPriceField() {
		return priceField;
	}

	public void setPriceField(TextField priceField) {
		this.priceField = priceField;
	}
	
	public void clearAllFields() {
		titleField.clear();
		isbnField.clear();
		authorField.clear();
		priceField.clear();
	}
	
}
