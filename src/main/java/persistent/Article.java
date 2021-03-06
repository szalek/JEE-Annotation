package persistent;

import pl.btbw.core.annotation.ObjectOverride;
import pl.btbw.core.annotation.ValueOverride;

public class Article {

	@ValueOverride(key = "NAME")
	private String name;

	private String description;

	@ObjectOverride(key = "CATEGORY")
	private Category category = new Category();

	public Article() {
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public Category getCategory() {
		return category;
	}
}
