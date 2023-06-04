package kodlama.io.Devs.dataAcces.concrates;

import kodlama.io.Devs.dataAcces.abstracts.PLanguageRepository;
import kodlama.io.Devs.entities.ProgramingLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryPLanguageRepository implements PLanguageRepository {
    List<ProgramingLanguage> programingLanguages;

    public InMemoryPLanguageRepository() {
        programingLanguages=new ArrayList<ProgramingLanguage>();
        programingLanguages.add(new ProgramingLanguage(1,"java"));
        programingLanguages.add(new ProgramingLanguage(2,"phyton"));
        programingLanguages.add(new ProgramingLanguage(3,"c#"));
        programingLanguages.add(new ProgramingLanguage(4,"javascript"));
    }



    @Override
    public List<ProgramingLanguage> getAll() {
        return programingLanguages;
    }

    @Override
    public ProgramingLanguage getById(int id) {
        for (ProgramingLanguage programmingLanguage:programingLanguages){
            if (programmingLanguage.getId()==id){
                return programmingLanguage;
            }
        }
        return null;
    }

    @Override
    public void add(ProgramingLanguage language) {
            programingLanguages.add(language);
    }

    @Override
    public void delete(ProgramingLanguage language) {
        programingLanguages.remove(language);
    }

    @Override
    public void update(ProgramingLanguage language) {
        for (ProgramingLanguage programmingLanguage:programingLanguages){
            if (programmingLanguage.getId()==language.getId()){
                programmingLanguage.setName(language.getName());
            }
        }
    }
}
