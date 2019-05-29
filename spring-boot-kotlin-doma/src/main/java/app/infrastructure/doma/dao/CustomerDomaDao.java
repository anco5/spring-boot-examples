package app.infrastructure.doma.dao;

import app.infrastructure.doma.entity.CustomerDomaEntity;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;
import org.springframework.stereotype.Service;

import java.util.List;


@Dao
@ConfigAutowireable
@Service
public interface CustomerDomaDao {
    @Select
    List<CustomerDomaEntity> selectAll();
}
