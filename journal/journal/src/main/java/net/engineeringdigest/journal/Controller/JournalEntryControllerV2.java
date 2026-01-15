package net.engineeringdigest.journal.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.engineeringdigest.journal.entity.JournalEntry;
import net.engineeringdigest.journal.service.JournalEntryService;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerV2 {
	
	@Autowired
	private JournalEntryService journalEntryService;
	
	@GetMapping("/journal/v2")
	public List<JournalEntry> getAll(){
		return journalEntryService.getAll();
	}
	
	@PostMapping("/journal/v2")
	public boolean createEntry(@RequestBody JournalEntry myEntry) {
		journalEntryService.saveEntry(myEntry);
		return true;
	}

}
