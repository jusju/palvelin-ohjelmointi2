package palvelinohjelmointi.Bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import palvelinohjelmointi.Bookstore.domain.Book;
import palvelinohjelmointi.Bookstore.domain.BookRepository;
import palvelinohjelmointi.Bookstore.domain.Category;
import palvelinohjelmointi.Bookstore.domain.CategoryRepository;
import palvelinohjelmointi.Bookstore.domain.User;
import palvelinohjelmointi.Bookstore.domain.UserRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner bookDemo(BookRepository repository, CategoryRepository crepository, UserRepository urepository) {
		return new CommandLineRunner() {
				@Override
				public void run(String... arg0) throws Exception {
					
//							User admin = new User("admin",
//							"$2a$10$0MMwY.IQqpsVc1jC8u7IJ.2rT8b0Cd3b3sfIBGV2zfgnPGtT4r0.C", "ADMIN");
//							urepository.save(admin);
//
//					
//					crepository.save(new Category("Non Fiction"));
//					crepository.save(new Category("Fiction"));
//					
//					repository.save(new Book("Felix", "1234567-1", "Book1", "2018", crepository.findByName("Non Fiction").get(0)));
//					repository.save(new Book("Kari", "2345678-1", "Book2", "2017", crepository.findByName("Non Fiction").get(0)));
//					repository.save(new Book("Kaisa", "3456789-1", "Book3", "2017", crepository.findByName("Non Fiction").get(0)));
//					
//					for (Book book: repository.findAll()) {
//						System.out.println(book.toString());
//				}
			};
		};
	}
}
	