package palvelinohjelmointi.Bookstore;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import palvelinohjelmointi.Bookstore.web.BookController;
import palvelinohjelmointi.Bookstore.web.BookService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookstoreApplicationTests {

	@Autowired
	private BookController controller;
	
	@Autowired
	private BookService bookservice;
	
	@Test
	public void contexLoads() throws Exception {
	}

}
