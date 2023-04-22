package todoapp.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import todoapp.Entries.Entries;
import todoapp.Serv.EntryService;

@RestController
@RequestMapping("/todo")
@CrossOrigin
public class MyRunner {
	@Autowired 
	EntryService es;
	
	@PostMapping("/add")
	public String addData(@RequestBody Entries en) {
		es.addData(en);
		return en.getValue()+" added succesfully";
	} 

}
