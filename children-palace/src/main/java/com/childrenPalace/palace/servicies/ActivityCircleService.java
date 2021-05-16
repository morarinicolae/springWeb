package com.childrenPalace.palace.servicies;

import com.childrenPalace.palace.model.ActivityCircle;
import com.childrenPalace.palace.repositories.ActivityCircleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ActivityCircleService {
    @Autowired
    private ActivityCircleRepository activityCircleRepository;

    public Iterable<ActivityCircle> listAll() {
        return activityCircleRepository.findAll();
    }

    public void save(ActivityCircle activityCircle) {
        activityCircleRepository.save(activityCircle);
    }

    public ActivityCircle get(Long id) {
        return activityCircleRepository.findById(id).get();
    }

    public void delete(Long id) {
        activityCircleRepository.deleteById(id);
    }
}
