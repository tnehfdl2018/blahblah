insert into teamtable values 
('기아 타이거즈', 'KIA Tigers', '1982년', '11회', '5위', '광주 광역시'),
('두산 베어스', 'Doosan Bears', '1982년', '5회', '2위', '서울 특별시'),
('SK 와이번스', 'SK Wyverns', '2000년', '4회', '1위', '인천 광역시'),
('키움 히어로즈', 'Kiwoom Heros', '2008년', '0회', '4위', '서울 특별시'),
('삼성 라이온즈', 'Samsumg Lions', '1982년', '8회', '6위', '대구 광역시'),
('NC 다이노스', 'NC Dinos', '2011년', '0회', '10위', '창원시'),
('KT 위즈', 'KT Wiz', '2013년', '0회', '9위', '수원시'),
('한화 이글스', 'Hanwha Eagles', '1986년', '1회', '3위', '대전 광역시'),
('롯데 자이언츠', 'Lotte Giants', '1982년', '2회', '7위', '부산 광역시'),
('LG 트윈스', 'LG Twins', '1982년', '2회', '8위', '서울 특별시');


insert into comment (team_name_kr, subject, writer, content, date)
 values
('기아 타이거즈', '와! 연승이다.', '최수빈', '6연승 각', now()),
('두산 베어스', '와! 연패다.', '이다일', '5연패 각', now()),
('SK 와이번스', '와! 일등이다.', '박승진', '우승 각', now());

