package james.web.template.dao.mapper;

import james.web.template.entity.DataTable;

public interface DataTableMapper {
    int deleteByPrimaryKey(int id);

    int insert(DataTable record);

    int insertSelective(DataTable record);

    DataTable selectByPrimaryKey(int id);

    int updateByPrimaryKeySelective(DataTable record);

    int updateByPrimaryKey(DataTable record);
}