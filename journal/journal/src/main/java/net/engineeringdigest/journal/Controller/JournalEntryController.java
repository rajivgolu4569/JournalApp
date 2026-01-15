package net.engineeringdigest.journal.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.engineeringdigest.journal.entity.JournalEntry;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {
	
	private Map<ObjectId, JournalEntry> journalEntries = new HashMap<>();
	
	
	@GetMapping
	public List<JournalEntry> getAll(){
		return new ArrayList<>(journalEntries.values());
	}
	
	@PostMapping
	public boolean createEntry(@RequestBody JournalEntry myEntry) {
		journalEntries.put(myEntry.getId(), myEntry);
		return true;
	}
	
	

}
