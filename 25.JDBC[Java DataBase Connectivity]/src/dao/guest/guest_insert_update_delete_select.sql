--Guest table  CRUD sql
--insert
insert into guest values(guest_guest_no_seq.nextval,'���ȣ',sysdate,'guard@gmail.com','http://www.itwill.co.kr','���ϻ���','����ó�� ����Ͻø�˴ϴ�.');
--pk update
update guest set guest_name='�̸�����',guest_date=sysdate,guest_email='change@gmail.com',guest_homepage='http://www.change.com',guest_title='Ÿ��Ʋ����',guest_content='���뺯��' where guest_no=1;
--pk delete 
delete from guest where guest_no=1;
--select
select* from guest where guest_no=2;
--selectAll
select * from guest;
