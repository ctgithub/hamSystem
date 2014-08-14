package com.uestc.hams.entity;
/**
 * 健康档案类
 * @author wujingnan
 *
 */
public class ResidentArchive {

	private Long id;
	private String rsArchiveId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRsArchiveId() {
		return rsArchiveId;
	}

	public void setRsArchiveId(String rsArchiveId) {
		this.rsArchiveId = rsArchiveId;
	}
	
}
