package org.bigdatacenter.dataprocessor.platform.domain.metadb.version1.meta;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by Anthony Jinhyuk Kim on 2017-06-08.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Deprecated
public class ColumnInfo implements Serializable {
    private Integer ecl_idx;
    private Integer edl_idx;
    private Integer etl_idx;
    private String ecl_kor_name;
    private String ecl_eng_name;
    private Integer ecl_search_type;
    private Integer is_usable;
}