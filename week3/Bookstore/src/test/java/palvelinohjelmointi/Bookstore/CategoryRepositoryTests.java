package palvelinohjelmointi.Bookstore;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import palvelinohjelmointi.Bookstore.domain.Category;
import palvelinohjelmointi.Bookstore.domain.CategoryRepository;


@RunWith(SpringRunner.class)
@DataJpaTest
public class CategoryRepositoryTests {
	
	@Autowired
	private CategoryRepository crepository;
	
	@Test
    public void listCategories() {
		crepository.save(new Category("Non Fiction"));
		List<Category> categorys = crepository.findByName("Non Fiction");
        assertThat(categorys).hasSize(1);
        
	}
	

}
