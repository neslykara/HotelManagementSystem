package com.tpe.repository;

import com.tpe.config.HibernateUtils;
import com.tpe.domain.Hotel;
import org.hibernate.Session;
import org.hibernate.Transaction;

//room,guest ve reservation icin service ve repo classlarını olusturalım : ÖDEV!!!
public class HotelRepository implements Repository<Hotel,Long>
{

    private Session session;

//1-b: save
    @Override
    public Hotel save(Hotel hotel) {
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            Transaction trs = session.beginTransaction();
            session.save(hotel);//insert into t_hotel values(?,?,?)
            trs.commit();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            HibernateUtils.closeSession(session);
        }
        return hotel;

    }


}