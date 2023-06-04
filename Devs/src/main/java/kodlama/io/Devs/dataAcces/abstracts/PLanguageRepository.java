package kodlama.io.Devs.dataAcces.abstracts;

import kodlama.io.Devs.entities.ProgramingLanguage;

import java.util.List;

public interface PLanguageRepository {

    List<ProgramingLanguage> getAll();

    ProgramingLanguage getById(int id);

    void add(ProgramingLanguage language);
    void delete(ProgramingLanguage language);
    void update(ProgramingLanguage language);
}
