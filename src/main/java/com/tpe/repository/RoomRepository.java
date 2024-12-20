package com.tpe.repository;

import com.tpe.config.HibernateUtils;
import com.tpe.domain.Room;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class RoomRepository implements Repository<Room, Long>
{
    private Session session;
    @Override
    public Room save(Room room) {
        try{
            session= HibernateUtils.getSessionFactory().openSession();
            Transaction trs = session.beginTransaction();
            session.save(room);

            trs.commit();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            HibernateUtils.closeSession(session);
        }
        return room;
    }
}
