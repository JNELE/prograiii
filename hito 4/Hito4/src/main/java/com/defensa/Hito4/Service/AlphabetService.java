package com.defensa.Hito4.Service;

import com.defensa.Hito4.Model.AlphabetModel2;
import com.defensa.Hito4.Repository.AlphabetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlphabetService implements AlphabetServiceInterface{
    private static final String Q_P = "Q,W,E,R,T,Y,U,I,O,P";
    private static final String A_L = "A,S,D,F,G,H,J,K,L";
    private static final String Z_M = "Z,X,C,V,B,N,M";
    @Autowired
    private AlphabetRepository alphabetRepository;

    @Override
    public void saveData() {
        if (alphabetRepository.count() == 0) {
            alphabetRepository.save(new AlphabetModel2(Q_P, "first"));
            alphabetRepository.save(new AlphabetModel2(A_L,"second"));
            alphabetRepository.save(new AlphabetModel2(Z_M,"three"));
        }
    }

    @Override
    public List<AlphabetModel2> getAllLettersFirst() {
        return alphabetRepository.getFirstRow();
    }

    @Override
    public List<AlphabetModel2> getAllLettersSecond() {
        return alphabetRepository.getSecondRow();
    }

    @Override
    public List<AlphabetModel2> getAllLettersThree() {
        return alphabetRepository.getThreeRow();
    }
}