package com.nowbeat.core;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@MappedSuperclass
public abstract class AbstractNowBeatEntity implements IEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "tableBasedIdGenerator")
	@TableGenerator(name = "tableBasedIdGenerator", table = "SEQUENCE_TABLE", pkColumnName = "SEQ_NAME", valueColumnName = "SEQ_COUNT", allocationSize = 100)

	@Column(name = "ID", precision = 10, scale = 0)
	private BigDecimal id;

	@Column(name = "PARENT_ID", precision = 10, scale = 0)
	private BigDecimal parentId = BigDecimal.ZERO;

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public BigDecimal getParentId() {
		return parentId;
	}

	public void setParentId(BigDecimal parentId) {
		this.parentId = parentId;
	}

	public static List<BigDecimal> getIdList(Iterable<? extends AbstractNowBeatEntity> abstractNowBeatEntityList)
	{
		List<BigDecimal> idList = new ArrayList<BigDecimal>();
		if(abstractNowBeatEntityList == null) return idList;
		for(AbstractNowBeatEntity abstractNowBeatEntity: abstractNowBeatEntityList){
			idList.add(abstractNowBeatEntity.getId());
		}
		return idList;
	}

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
