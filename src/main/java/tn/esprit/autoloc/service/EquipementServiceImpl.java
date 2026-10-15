package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Equipement;
import tn.esprit.autoloc.repository.EquipementRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class EquipementServiceImpl implements IEquipementService{
    final EquipementRepository ER1;
    @Override
    public List<Equipement> retrieveAllEquipements() {
        return (List<Equipement>) ER1.findAll();
    }

    @Override
    public Equipement addEquipement(Equipement e) {
        return ER1.save(e);
    }

    @Override
    public Equipement updateEquipement(Equipement e) {
        return ER1.save(e);
    }

    @Override
    public Equipement retrieveEquipement(Long idEquipement) {
        return ER1.findById(idEquipement).orElse(null);
    }

    @Override
    public void removeEquipement(Long idEquipement) {
        ER1.deleteById(idEquipement);

    }

    @Override
    public List<Equipement> addEquipements(List<Equipement> equipements) {
        return (List<Equipement>) ER1.saveAll(equipements);
    }
}
