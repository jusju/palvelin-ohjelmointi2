package palvelinohjelmointi.Bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import palvelinohjelmointi.Bookstore.domain.Book;
import palvelinohjelmointi.Bookstore.domain.BookRepository;
import palvelinohjelmointi.Bookstore.domain.Category;
import palvelinohjelmointi.Bookstore.domain.CategoryRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner bookDemo(BookRepository repository, CategoryRepository crepository) {
		return new CommandLineRunner() {
				@Override
				public void run(String... arg0) throws Exception {
					
					crepository.save(new Category("Non Fiction"));
					crepository.save(new Category("Fiction"));
					
					repository.save(new Book("Felix", "1234567", "Anusapinan seikkailu", "2018", crepository.findByName("Non Fiction").get(0)));
					repository.save(new Book("Kari", "2345678", "Kuinka tehdä vakuuttava vakuutuspetos", "2017", crepository.findByName("Non Fiction").get(0)));
					
					for (Book book: repository.findAll()) {
						System.out.println(book.toString());
				}
			};
		};
	}
}
	