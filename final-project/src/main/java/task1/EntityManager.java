package task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EntityManager<T extends IEntityAbilities> {
    List<T> list;

    public EntityManager() {
        this.list = new ArrayList<>();
    }

    public List<T> getList() {
        return list;
    }

    public synchronized boolean addEntity(T entity) {
        list.add(entity);
        return true;
    }

    public synchronized boolean deleteEntity(T entity) {
        if (list.contains(entity)) {
            list.remove(entity);
            return true;
        } else {
            return false;
        }
    }

    public synchronized List<T> returnCopyOfList(){
        return new ArrayList<>(list);
    }

    public synchronized List<T> filterByAge(int min, int max){
       return list.stream().filter(entity -> entity.getAge() >= min && entity.getAge() <= max).collect(Collectors.toList());
    }

    public synchronized List<T> filterByName(String name){
        return list.stream().filter(entity -> entity.getName().equals(name)).collect(Collectors.toList());
    }

    public synchronized List<T> filterByStatus(boolean status){
        return list.stream().filter(entity -> entity.isActive() == status).collect(Collectors.toList());
    }




}
