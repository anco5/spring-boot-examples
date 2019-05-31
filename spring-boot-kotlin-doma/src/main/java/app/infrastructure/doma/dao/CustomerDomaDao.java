package app.infrastructure.doma.dao;

import app.infrastructure.doma.entity.CustomerDomaEntity;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import java.util.List;


@Dao
@ConfigAutowireable
public interface CustomerDomaDao {
    @Select
    List<CustomerDomaEntity> selectAll();
}
