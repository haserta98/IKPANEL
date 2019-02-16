package com.sefakaya.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Job {
		
// Attribute tanýmlarý.
	
			@Id
			@GeneratedValue(strategy=GenerationType.IDENTITY)
			private Long id;
	
			private String isUnvani;
	
			@Column(length=99999)
			private String isTanimi;
	
			private int kisiSayisi;
	
			private String sonBasvuruT;
			
// Getter , Setter metodlarý.
			
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getIsUnvani() {
			return isUnvani;
		}

		public void setIsUnvani(String isUnvani) {
			this.isUnvani = isUnvani;
		}

		public String getIsTanimi() {
			return isTanimi;
		}

		public void setIsTanimi(String isTanimi) {
			this.isTanimi = isTanimi;
		}

		public int getKisiSayisi() {
			return kisiSayisi;
		}

		public void setKisiSayisi(int kisiSayisi) {
			this.kisiSayisi = kisiSayisi;
		}

		public String getSonBasvuruT() {
			return sonBasvuruT;
		}

		public void setSonBasvuruT(String sonBasvuruT) {
			this.sonBasvuruT = sonBasvuruT;
		}

		@Override
		public String toString() {
			return "Job [id=" + id + ", isUnvani=" + isUnvani + ", isTanimi=" + isTanimi + ", kisiSayisi=" + kisiSayisi
					+ ", sonBasvuruT=" + sonBasvuruT + "]";
		}

		
	
	
}
