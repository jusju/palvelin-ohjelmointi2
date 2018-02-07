package palvelinohjelmointi.Bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import palvelinohjelmointi.Bookstore.domain.Book;
import palvelinohjelmointi.Bookstore.domain.BookRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner bookDemo(BookRepository repository) {
		return new CommandLineRunner() {
				@Override
				public void run(String... arg0) throws Exception {
					repository.save(new Book("Felix", "1234567", "Anusapinan seikkailu", "2018"));
					repository.save(new Book("Kari", "2345678", "Kuinka tehdä vakuuttava vakuutuspetos", "2017"));
					
					for (Book book: repository.findAll()) {
						System.out.println(book.toString());
				}
			};
		};
	}
}
	