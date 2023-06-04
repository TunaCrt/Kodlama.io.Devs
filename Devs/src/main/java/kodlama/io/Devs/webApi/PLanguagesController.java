package kodlama.io.Devs.webApi;

import kodlama.io.Devs.Businnes.abstracts.PLanguageService;
import kodlama.io.Devs.entities.ProgramingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class PLanguagesController {

    private PLanguageService pLanguageService;

    @Autowired
    public PLanguagesController(PLanguageService pLanguageService) {
        this.pLanguageService = pLanguageService;
    }

    @RequestMapping("/getall")
    public List<ProgramingLanguage> getAll() {
        return pLanguageService.getAll();
    }

    @GetMapping("/getById")
    public ProgramingLanguage getById(int id) {
        return pLanguageService.getById(id);

    }
    @PostMapping("/add")
    //@ResponseStatus(code = org.springframework.http.HttpStatus.CREATED)
    public void add(@RequestBody ProgramingLanguage language)throws Exception {
        pLanguageService.add(language);
    }

    @DeleteMapping("/delete")
    public void delete(ProgramingLanguage language) {
        pLanguageService.delete(language);
    }

    @PostMapping("update")
    public void update(ProgramingLanguage language) {
        pLanguageService.update(language);
    }


}
