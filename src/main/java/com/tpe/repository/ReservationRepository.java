package com.tpe.repository;

import com.tpe.config.HibernateUtils;
import com.tpe.domain.Reservation;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ReservationRepository implements Repository<Reservation,Long>
{
    private Session session;
    @Override
    public Reservation save(Reservation reservation) {
        try{
            session= HibernateUtils.getSessionFactory().openSession();
            Transaction trs = session.beginTransaction();
            session.save(reservation);

            trs.commit();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return reservation;
    }
}
