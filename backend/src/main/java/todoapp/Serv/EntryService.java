package todoapp.Serv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import todoapp.Entries.Entries;
import todoapp.Repo.EntryRepo;

@Service
public class EntryService {
	 @Autowired
	 EntryRepo er;
	 
	 public void addData(Entries  en) {
		 er.save(en);
	 }

}
