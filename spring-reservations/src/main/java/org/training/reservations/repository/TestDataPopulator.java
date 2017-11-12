package org.training.reservations.repository;

import java.util.Calendar;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.training.reservations.model.Reservation;

/** Throw-away code just for populating test data into the database. */
@Component
public class TestDataPopulator {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Inject
    private ReservationRepository repository;

    @PostConstruct
    public void init() {
        logger.debug("INIT the db with some test data");

        Calendar from = Calendar.getInstance();
        from.set(2014, 10, 01);
        Calendar to = Calendar.getInstance();
        to.set(2014, 10, 01);

        Reservation s = new Reservation();
        s.setResourceId((long) 1);
        s.setStartDate(from.getTime());
        s.setEndDate(to.getTime());
        s.setOwner("Joe");
        repository.save(s);

        Reservation s1 = new Reservation();
        s1.setResourceId((long) 2);
        s1.setStartDate(from.getTime());
        s1.setEndDate(to.getTime());
        s1.setOwner("Mary");
        repository.save(s1);

        Reservation s2 = new Reservation();
        s2.setResourceId((long) 33);
        s2.setStartDate(from.getTime());
        s2.setEndDate(to.getTime());
        s2.setOwner("Aradi Patrik");
        repository.save(s2);

        Reservation s3 = new Reservation();
        s3.setResourceId((long) 25);
        s3.setStartDate(from.getTime());
        s3.setEndDate(to.getTime());
        s3.setOwner("Katy Perry");
        repository.save(s3);

        Reservation s4 = new Reservation();
        s4.setResourceId((long) 22);
        s4.setStartDate(from.getTime());
        s4.setEndDate(to.getTime());
        s4.setOwner("Eminem");
        repository.save(s4);
    }
}
