package com.defensa.Hito4.Service;

import com.defensa.Hito4.Model.AlphabetModel2;
import com.defensa.Hito4.Model.DictionaryModel;
import com.defensa.Hito4.Repository.AlphabetRepository;
import com.defensa.Hito4.Repository.DictionaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DictionaryService implements DictionaryServiceInterface{
    @Autowired
    private DictionaryRepository dictionaryRepository;

    @Override
    public void saveData() {
        if (dictionaryRepository.count() == 0) {

            dictionaryRepository.save(new DictionaryModel("MONDAY", "SEGUNDA-FEIRA","LUNES"));
            dictionaryRepository.save(new DictionaryModel("TUESDAY","TERCA-FEIRA" ,"MARTES"));
            dictionaryRepository.save(new DictionaryModel("WEDNESDAY","QUARTA-FEIRA","MIERCOLES"));
            dictionaryRepository.save(new DictionaryModel("THURSDAY","QUINTA-FEIRA","JUEVES"));
            dictionaryRepository.save(new DictionaryModel("FRIDAY","SEXTA-FEIRA","VIERNES"));
            dictionaryRepository.save(new DictionaryModel("SATURDAY","SABADO","SABADO"));
            dictionaryRepository.save(new DictionaryModel("SUNDAY","DOMINGO","DOMINGO"));
        }
    }

    @Override
    public String traducir(String t, String l) {
        DictionaryModel dictionaryModel = dictionaryRepository.getWordTranslate(t);
        String ingles = dictionaryModel.getEnglish();
        String ln_i = "INGLES";
        String word = dictionaryModel.getWord();
        String ln_w = "ESPAÑOL";
        String portugues = dictionaryModel.getPortugues();
        String ln_p = "PORTUGUES";
        String traduccion = "";
        if(l.equals(ln_i)){
            traduccion = ingles;
        }
        if(l.equals(ln_w)){
            traduccion = word;
        }
        if(l.equals(ln_p)){
            traduccion = portugues;
        }
        return traduccion;
    }
}
