package kodlama.io.Devs.Businnes.concrates;

import kodlama.io.Devs.Businnes.abstracts.PLanguageService;
import kodlama.io.Devs.dataAcces.abstracts.PLanguageRepository;
import kodlama.io.Devs.dataAcces.concrates.InMemoryPLanguageRepository;
import kodlama.io.Devs.entities.ProgramingLanguage;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PLanguageManager implements PLanguageService {

    private PLanguageRepository pLanguageRepository;
    List<ProgramingLanguage>languages;

    public PLanguageManager(PLanguageRepository pLanguageRepository) {
        //pLanguageRepository=new InMemoryPLanguageRepository();
        this.pLanguageRepository=pLanguageRepository;
    }


    @Override
    public List<ProgramingLanguage> getAll() {
        return pLanguageRepository.getAll();
    }

    @Override
    public ProgramingLanguage getById(int id) {
        return pLanguageRepository.getById(id);
    }

    @SneakyThrows
    @Override
    public void add(ProgramingLanguage language) {
        if (language.getName().equals("")){
            throw  new Exception("Kurs ismi boş olamaz");
        }
        for (int i=0;i<languages.size();i++){
            if (language.getName().equals(pLanguageRepository.getById(i).getName())){
               throw  new Exception("bu isimde bir kurs zaten var!");
            }
        }
        pLanguageRepository.add(language);
    }

    @Override
    public void delete(ProgramingLanguage language) {
            pLanguageRepository.delete(language);
    }

    @Override
    public void update(ProgramingLanguage language) {
            pLanguageRepository.update(language);
    }
}
