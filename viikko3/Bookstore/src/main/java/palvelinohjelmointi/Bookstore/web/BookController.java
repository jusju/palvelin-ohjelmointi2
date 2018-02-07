package palvelinohjelmointi.Bookstore.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import palvelinohjelmointi.Bookstore.domain.Book;
import palvelinohjelmointi.Bookstore.domain.BookRepository;

@Controller
public class BookController {
	@Autowired
	BookRepository repository;
	
	@RequestMapping(value="/booklist")
	public String bookList(Model model) {
		model.addAttribute("books", repository.findAll());
		return "booklist";
	}
	
	@RequestMapping(value="/addbook")
	public String addBook(Model model){
		model.addAttribute("book", new Book());
		return "addbook";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String saveBook(Book book){
		repository.save(book);
		return "redirect:booklist";
	}
	
	@RequestMapping(value="/edit/{id}")
		public String editBook(@PathVariable("id") Long id, Book book, Model model){
		model.addAttribute("book", repository.findOne(id));
		return "editbook";
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public String deleteBook(@PathVariable("id") Long id, Model model){
		repository.delete(id);
		return "redirect:../booklist";
	}
}