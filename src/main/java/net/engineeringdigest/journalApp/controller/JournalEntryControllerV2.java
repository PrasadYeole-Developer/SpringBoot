package net.engineeringdigest.journalApp.controller;

import net.engineeringdigest.journalApp.entity.JournalEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerV2 {

    @GetMapping
    public List<JournalEntity> getAllEntries(){
        return null;
    }

    @GetMapping("/id/{id}")
    public JournalEntity getEntry(@PathVariable Long id){
        return null;
    }

    @PostMapping
    public JournalEntity createEntry(@RequestBody JournalEntity newEntry){
        return null;
    }

    @DeleteMapping("/id/{id}")
    public JournalEntity deleteEntry(@PathVariable Long id){
        return null;
    }

    @PutMapping("/id/{id}")
    public JournalEntity updateEntry(@PathVariable Long id, @RequestBody JournalEntity newEntry){
        return null;
    }
}
