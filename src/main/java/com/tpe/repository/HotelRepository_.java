/*package com.tpe.repository;

import com.tpe.config.HibernateUtils;
import com.tpe.exception.HotelNotFoundException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class HotelRepository_ implements Repository<Hotel,Long>
{

    @Override
    public Hotel save(Hotel object) {

        try {
            Session session = HibernateUtils.getSessionFactory().openSession();
            Transaction trs = session.beginTransaction();
            session.save(object);
            trs.commit();
            session.close();
            return object;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            HibernateUtils.shutDown();
        }


    }

    @Override
    public Hotel findObjectById(Long id) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        return  session.get(Hotel.class,id);

    }

    @Override
    public void update(Hotel object) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction trs = session.beginTransaction();

        Hotel existingHotel = session.get(Hotel.class,object.getId());
        if (existingHotel!=null){
            existingHotel.setName(object.getName());
            existingHotel.setLocation(object.getLocation());

            session.update(existingHotel);
        }
        trs.commit();
        session.close();


    }

    @Override
    public void delete(Long id) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction trs = session.beginTransaction();
        Hotel hotelToDelete = session.get(Hotel.class,id);
        if (hotelToDelete!=null){
            session.delete(hotelToDelete);
            trs.commit();
        }else {
            try {
                throw new HotelNotFoundException("Hotel not found with id : "+id);
            }catch (HotelNotFoundException e){
                System.out.println(e.getMessage());
            }
        }

    }

    @Override
    public List<Hotel> findAll() {
        Session session =HibernateUtils.getSessionFactory().openSession();
        return  session.createQuery("from Hotel", Hotel.class).getResultList();
    }
}
*/