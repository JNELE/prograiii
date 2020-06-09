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

//    @Override
//    public List<DictionaryModel> getAllLettersFirst() {
//        return dictionaryRepository.getFirstRow();
//    }
//
//    @Override
//    public List<DictionaryModel> getAllLettersSecond() {
//        return dictionaryRepository.getSecondRow();
//    }
//
//    @Override
//    public List<DictionaryModel> getAllLettersThree() {
//        return dictionaryRepository.getThreeRow();
//    }
}
