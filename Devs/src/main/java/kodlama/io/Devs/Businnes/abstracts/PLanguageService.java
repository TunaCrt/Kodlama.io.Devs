package kodlama.io.Devs.Businnes.abstracts;

import kodlama.io.Devs.entities.ProgramingLanguage;

import java.util.List;

public interface PLanguageService {
    List<ProgramingLanguage> getAll();

    ProgramingLanguage getById(int id);

    void add(ProgramingLanguage language);
    void delete(ProgramingLanguage language);
    void update(ProgramingLanguage language);
}
